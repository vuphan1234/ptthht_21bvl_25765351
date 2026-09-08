package LAB.LAB1;

import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What's your name?");
		String str = sc.nextLine();
		System.out.printf("Hi, I am %s", str);
	}
}
