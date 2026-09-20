package LAB.LAB3.src;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class TextFileDemo {
	public static void main(String[] args) {
		Path path = Path.of("D:\\VUPHAN\\PHAT_TRIEN_TICH_HOP_HE_THONG\\PTTHHT\\src\\LAB\\LAB3\\data", "ghi_chi.txt");
//		System.out.println(path.toAbsolutePath());
		
		try {
			Files.createDirectories(path.getParent());
			
			try (BufferedWriter writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8)) {
				writer.write("JAVA I/O lam viec voi cac luong du lieu");
				writer.newLine();
				writer.write("BufferedWriter giup ghi van ban hieu qua.");
				writer.newLine();
				writer.write("UTF-8 ho tro tieng viet on dinh");
			}
			
			try (BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
				String line;
				int number = 1;
				while ((line = reader.readLine()) != null) {
					System.out.printf("%d. %s%n", number++, line);
				}
			}
		} catch (IOException e) {
			System.out.println("Loi xu ly tep " + path + ": " + e.getMessage());
		}
	}
}
