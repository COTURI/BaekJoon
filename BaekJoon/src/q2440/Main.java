package q2440;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();

//		for (int i = a; i > 0; --i) {
//			for (int j = 0; j < i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
