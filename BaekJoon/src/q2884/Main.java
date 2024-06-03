package q2884;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		if(m>=45) {
			System.out.println(h + " " + (m-45));
		}else if(m == 0) {
			System.out.println((h-1) + " " + (60-45));
		}
	}
}
