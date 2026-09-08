package LAB.LAB1;

import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vui long nhap so hang thu nhat: ");
		int soA = sc.nextInt();
		System.out.println("Vui long nhap so hang thu hai: ");
		int soB = sc.nextInt();
		int kq = soA + soB;
		System.out.printf("Tinh tong [ %d + %d ] = %d", soA, soB, kq);
		sc.close();
	}
}
