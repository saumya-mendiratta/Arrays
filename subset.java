package lec4;

import java.util.Scanner;

public class subset {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] a = new int[n];
	//	int[] a = { 1, 2, 3, 4 };
		for (int i = 0; i < a.length; i++) {
			a[i]=scn.nextInt();
		}
		int limit = (int) Math.pow(2, a.length);
		int rem = 0;
		for (int n = 0; n <= limit - 1; n++) {
			int temp = n;
			for (int i = 0; i < a.length; i++) {
				rem = temp % 2;
				if (rem == 1)
					System.out.print(a[i] + " ");
				temp = temp / 2;
			}
			System.out.println();

		}

	}

}
