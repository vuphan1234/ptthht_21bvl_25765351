package LAB.Lab4_Tiep_Theo.Bai2_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Server {
    static String[] WORDS = {"không", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};

    public static void main(String[] args) throws IOException {
        int port = 5001;
        ServerSocket serverSocket = new ServerSocket(port);
        System.out.println("Server dang chay o cong " + port + "...");

        while (true) {
            Socket socket = serverSocket.accept();
            System.out.println("Client ket noi: " + socket.getRemoteSocketAddress());

            // Mỗi client một luồng riêng -> nhiều client dùng cùng lúc
            new Thread(() -> handle(socket)).start();
        }
    }

    static void handle(Socket socket) {
        try {
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
            PrintWriter out = new PrintWriter(
                    new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8), true);

            String line;
            while ((line = in.readLine()) != null) {
                if (line.equals("QUIT")) {
                    out.println("BYE");
                    break;
                }

                if (line.length() == 1 && line.charAt(0) >= '0' && line.charAt(0) <= '9') {
                    out.println(WORDS[line.charAt(0) - '0']);
                } else {
                    out.println("ERR INVALID_DIGIT");
                }
            }
            socket.close();
            System.out.println("Client da ngat ket noi: " + socket.getRemoteSocketAddress());
        } catch (IOException e) {
            System.out.println("Loi voi client: " + e.getMessage());
        }
    }
}