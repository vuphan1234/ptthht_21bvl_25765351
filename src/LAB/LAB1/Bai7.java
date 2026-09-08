package LAB.LAB1;

import java.nio.file.Files;
import java.nio.file.Path;

public class Bai7 {
	public void findFile(String source, String key) {
		Path path = Path.of(source);
		if (Files.exists(path)) {
			if (Files.isDirectory(path)) {
				
			}
		}
	}
	
	public static void main(String[] args) {
		
	}
}
