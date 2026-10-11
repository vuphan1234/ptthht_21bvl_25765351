package LAB.Lab4_Tiep_Theo.Bai2;

import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;

public class Server {
    static String[] WORDS = {"không", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};

    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(5000);
        System.out.println("Server dang chay o cong 5000...");

        while (true) {
            Socket socket = server.accept();
            System.out.println("Client ket noi: " + socket.getRemoteSocketAddress());

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
                // Hợp lệ khi đúng 1 ký tự từ '0' đến '9'
                if (line.length() == 1 && line.charAt(0) >= '0' && line.charAt(0) <= '9') {
                    out.println(WORDS[line.charAt(0) - '0']);
                } else {
                    out.println("ERR INVALID_DIGIT");
                }
            }

            socket.close();
            System.out.println("Client da ngat ket noi");
        }
    }
}