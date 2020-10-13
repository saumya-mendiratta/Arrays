package lec4;

import java.util.Scanner;

public class primes {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int lo = scn.nextInt();
		int hi = scn.nextInt();

		printprimes(lo, hi);

	}

	public static void printprimes(int lo, int hi) {
		for (int i = lo; i <= hi; i++) {
			boolean res = isprime(i);
			if (res)
				System.out.println(i);
		}
	}

	public static boolean isprime(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				count++;
		}
		if (count == 2)
			return true;
		else
			return false;
	}

}
