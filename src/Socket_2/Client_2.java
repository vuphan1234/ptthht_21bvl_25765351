package Socket_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client_2 {
	public static void main(String[] args) {
		String host = "127.0.0.1";
		int port = 65432;
		
		try (Socket socket = new Socket(host, port);
				BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
				Scanner scanner = new Scanner(System.in)) 
		{
			System.out.println("Da ket noi den server");
			while (true) {
				System.out.println("Nhap tin nhan (q de thoat): ");
				String msg = scanner.nextLine();
				if (msg.equals("q")) break;
				
				out.println(msg);
				System.out.println("Phan hoi: " + in.readLine());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
