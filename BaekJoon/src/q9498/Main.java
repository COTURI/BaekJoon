package q9498;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int scr = sc.nextInt();
		sc.close();
		
		if(scr>=90) {
			System.out.println("A");
		}else if(scr>=80) {
			System.out.println("B");
		}else if(scr>=70) {
			System.out.println("C");
		}else if(scr>=60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}

	}
}
