package LAB.Lab4_Tiep_Theo.Bai2_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;

public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("localhost", 5001);
		
		BufferedReader in = new BufferedReader(
				new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
		PrintWriter out = new PrintWriter(
				new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8), true);
		BufferedReader keyboard = new BufferedReader(
				new InputStreamReader(System.in, StandardCharsets.UTF_8));
		
		System.out.println("Nhap mot chu so 0-9, go QUIT de thoat");
		while (true) {
			System.out.println("> ");
			String line = keyboard.readLine();
			if (line == null) line = "QUIT";
			
			out.println(line);
			System.out.println(in.readLine());
			
			if (line.equals("QUIT")) break;
		}
		
		socket.close();
	}
}
