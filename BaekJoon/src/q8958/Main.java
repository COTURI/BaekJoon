package q8958;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			int anw = 0;
			int cnt = 0;
			String str = sc.next();
			for (int j = 0; j < str.length(); j++)
				if (str.charAt(j) == 'O') {
					cnt++;
					anw += cnt;
				} else {
					cnt = 0;
				}
			System.out.println(anw);
		}
		sc.close();
	}
}
