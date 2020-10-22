package lec4;

import java.util.Scanner;

public class inverse {

	public static void main(String[] args) {

		 Scanner scn = new Scanner(System.in);
		
		int[] arr = takeinput();
		int n = arr.length;
		int[] b = new int[n];
		int temp = 0;
		for (int i = 0; i < n; i++) {
			temp = arr[i];
			b[temp] = i;

		}
		for (int j = 0; j < b.length; j++) {
			System.out.print(b[j] + " ");
		}
	}

	public static int[] takeinput() {

		int n = scn.nextInt();
		
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {

			int val = scn.nextInt();
			arr[i] = val;
		}
		return arr;
	}

}
