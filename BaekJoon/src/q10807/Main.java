package q10807;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int v = sc.nextInt();
		int cnt = 0;
		for (int s : arr) {
			if (s == v) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
