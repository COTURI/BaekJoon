package q3040;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] nan = new int[9];
		int sum = 0;

		for (int i = 0; i < nan.length; i++) {
			nan[i] = sc.nextInt();
			sum += nan[i];
		}
		sc.close();
		for (int i = 0; i < nan.length; i++) {
			for (int j = i + 1; j < nan.length; j++) {
				if (sum - nan[i] - nan[j] == 100) {
					for (int k = 0; k < nan.length; k++)
						if (k != i && k != j) {
							System.out.println(nan[k]);

						}
				}
			}
		}
	}
}