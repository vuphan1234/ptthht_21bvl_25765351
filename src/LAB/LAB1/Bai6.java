package LAB.LAB1;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class Bai6 {
	
	private void deleteFile(String source) throws IOException {
		Path path = Path.of(source);
		if (Files.exists(path)) {
			System.out.println("File ton tai!");
			Files.delete(path);
			System.out.println("Xoa file thanh cong!");
		} else {
			System.out.println("File khong ton tai!");
		}
	}
	
	public boolean deleteEmptyFolder(String source) {
		Path path = Path.of(source);
		
		if (Files.exists(path)) {
			try {
				Files.delete(path);
				System.out.println("Folder ton tai\n Xoa thanh cong!");
				return true;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("Folder khong ton tai!");
		}
		return false;
	}
	
//	public boolean deleteListFileInFolder(String source) {
//		Path path = Path.of(source);
//		
//		if (Files.exists(path)) {
//			try (DirectoryStream<Path> listFile = Files.newDirectoryStream(path)) {
//				for (Path file : listFile) {
//					
//				}
//			} catch () {
//				
//			}
//			
//		}
//	}
	
	public static void main(String[] args) throws IOException {
		Bai6 bai6 = new Bai6();
//		bai6.deleteFile("D:\\VUPHAN\\PHAT_TRIEN_TICH_HOP_HE_THONG\\PTTHHT\\src\\LAB\\LAB1\\demo.txt");
//		bai6.deleteEmptyFolder("D:\\VUPHAN\\PHAT_TRIEN_TICH_HOP_HE_THONG\\PTTHHT\\src\\LAB\\LAB1\\demo");
		
	}
}
