package Buoi3_Stream;

import java.io.IOException;
import java.io.InputStream;

public class Bai1 {
	public static void main(String[] args) {
		InputStream is = System.in;
		while(true) {
			try {
				int ch = is.read();
				if (ch == -1 || ch == 'q') break;
			} catch (IOException e) {
				e.getStackTrace();
			}
		}
	}
}
