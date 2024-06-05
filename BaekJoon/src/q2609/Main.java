package q2609;

import java.util.Scanner;

public class Main {
	public static int getg(int num1, int num2) {
		if(num1%num2 == 0) {
			return num2;
		}
		return getg(num2, num1%num2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		int anw = getg(a, b);
		
		System.out.println(anw);
		System.out.println((a*b) /anw);
		
	}

}
