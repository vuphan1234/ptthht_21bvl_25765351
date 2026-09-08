package LAB.LAB1;

import java.util.Scanner;

public class Bai4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(">> Kiem tra so chan le");
		System.out.println("Vui long nhap so can kiem tra: ");
		int so = sc.nextInt();
		if (so % 2 == 0) System.out.printf("So %d la so chan", so);
		else System.out.printf("So %d la so le", so);
	}
}
