package q1152;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		StringTokenizer stiz = new StringTokenizer(str);
		int cnt = stiz.countTokens();
		
		System.out.println(cnt);
	}
}
