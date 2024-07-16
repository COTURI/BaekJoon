package q14489;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = c*2;
		sc.close();
		if(a+b>=d) {
			System.out.println((a+b)-d);
		}else {
			System.out.println(a+b);
		}
	}

}
