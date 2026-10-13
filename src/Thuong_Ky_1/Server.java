package Thuong_Ky_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Server {
    public static String[] roomNames = {"IT", "NhanSu", "MKT", "KeToan"};

    public static Map<String, List<ClientHandler>> rooms = new HashMap<>();
 
    public static void main(String[] args) throws IOException {
        for (String r : roomNames) {
            rooms.put(r, new ArrayList<>());
        }
 
        ServerSocket server = new ServerSocket(9999);
        System.out.println("Server dang chay o cong 9999");
 
        while (true) {
            Socket socket = server.accept();
            System.out.println("Co client ket noi: " + socket.getInetAddress());
            new ClientHandler(socket).start();
        }
    }

    static synchronized void sendToRoom(String room, String msg, ClientHandler sender) {
        for (ClientHandler c : rooms.get(room)) {
            if (c != sender) {
                c.out.println(msg);
            }
        }
    }
}

class ClientHandler extends Thread {
    Socket socket;
    BufferedReader in;
    PrintWriter out;
    String name;
    String room;
 
    ClientHandler(Socket socket) {
        this.socket = socket;
    }
 
    public void run() {
        try {
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);

            out.println("Nhap ten cua ban:");
            name = in.readLine();
            System.out.println(name + " da dang nhap");
 
            while (true) {
                out.println("DANH SACH PHONG:");
                for (int i = 0; i < Server.roomNames.length; i++) {
                    out.println((i + 1) + ". " + Server.roomNames[i]);
                }
                out.println("Chon so phong (hoac /exit de thoat):");
 
                String choice = in.readLine();
                if (choice == null || choice.equals("/exit")) {
                    break;
                }
 
                int index;
                try {
                    index = Integer.parseInt(choice) - 1;
                } catch (NumberFormatException e) {
                    index = -1;
                }
                if (index < 0 || index >= Server.roomNames.length) {
                    out.println("Phong khong hop le!");
                    continue;
                }

                room = Server.roomNames[index];
                synchronized (Server.class) {
                	Server.rooms.get(room).add(this);
                }
                out.println("Ban da vao phong " + room + ". Go /quit de roi phong, /exit de thoat.");
                Server.sendToRoom(room, name + " da vao phong.", this);
                System.out.println(name + " vao phong " + room);

                String msg;
                boolean exit = false;
                while ((msg = in.readLine()) != null) {
                    if (msg.equals("/quit")) {
                        break;
                    }
                    if (msg.equals("/exit")) {
                        exit = true;
                        break;
                    }
                    Server.sendToRoom(room, name + ": " + msg, this);
                }
                if (msg == null) exit = true;

                synchronized (Server.class) {
                	Server.rooms.get(room).remove(this);
                }
                Server.sendToRoom(room, name + " da roi phong.", this);
                System.out.println(name + " roi phong " + room);
 
                if (exit) break;
            }
 
            out.println("Da ngat ket noi. Tam biet!");
            socket.close();
            System.out.println(name + " da ngat ket noi");
        } catch (IOException e) {
            System.out.println("Client mat ket noi");
        }
    }
}
