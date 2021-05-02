package self_afterarray;

import java.util.Scanner;

public class palin_string {

	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		
		String s= scn.next();
		System.out.println(palin(s));
		
		
	}

	public static boolean palin(String s) {
		int count = 0;
		for (int i = s.length() - 1, j = 0; i > j; i--, j++) {
			if (s.charAt(i) != s.charAt(j))
				return false;

		}

		return true;
	}
		
}

