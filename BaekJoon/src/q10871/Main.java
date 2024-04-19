package q10871;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();
//		int X = sc.nextInt();
//		for(int i = 0; i<N; i++) {
//			int A = sc.nextInt();
//			if(A<X) {
//				System.out.print(A + " ");
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int X = sc.nextInt();

		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			if (A[i] < X) {
				System.out.print(A[i] + " ");

			}
		}sc.close();
	}
}
