package q1193;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int lv = 1;
		int rv = 1;
		for(int i =0; i<n ; i+=2) {
			lv += i;
			
		}
		
		for(int i =2; i<n ; i+=2) {
			rv += i;
			
		}
	 System.out.println(rv +"/"+ lv);
	}
}
