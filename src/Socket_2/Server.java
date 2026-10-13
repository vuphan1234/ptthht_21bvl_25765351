package Socket_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {
		int port = 65432;
		
		try (ServerSocket serverSocket = new ServerSocket(port)) {
			System.out.println("server dang chay tai cong " + port);
			
			while (true) {
				Socket clientSocket = serverSocket.accept();
			    new Thread(() -> handleClient(clientSocket)).start();
				System.out.println("Da ket noi voi " + clientSocket.getInetAddress());
			
			try (BufferedReader in = new BufferedReader(
					new InputStreamReader(clientSocket.getInputStream()));
				PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true))	
			{
				String message;
				while ((message = in.readLine()) != null) { // null = client da dong
					System.out.println("Nhan: " + message);
					out.println("Server da nhan: " + message);
				}
			}
			clientSocket.close();
			System.out.println("Client da ngat ket noi");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static Object handleClient(Socket clientSocket) {
		// TODO Auto-generated method stub
		System.out.println("xin chao");
		return null;
	}
}
