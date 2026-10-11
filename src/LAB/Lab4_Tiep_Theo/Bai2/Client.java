package LAB.Lab4_Tiep_Theo.Bai2;

import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 5001);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
        PrintWriter out = new PrintWriter(
                new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8), true);
        BufferedReader keyboard = new BufferedReader(
                new InputStreamReader(System.in, StandardCharsets.UTF_8));

        System.out.println("Nhap mot chu so 0-9, go QUIT de thoat.");
        while (true) {
            System.out.print("> ");
            String line = keyboard.readLine();
            if (line == null) line = "QUIT";

            out.println(line);                     // gửi 1 dòng
            System.out.println(in.readLine());     // nhận 1 dòng

            if (line.equals("QUIT")) break;
        }

        socket.close();
    }
}