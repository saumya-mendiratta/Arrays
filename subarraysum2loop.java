package lec4;

public class subarraysum2loop {

	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 40 };
		int n = a.length;
		int sum = 0;
		int sum2 = 0;

		for (int i = 1; i <= n; i++)
			sum += i;

		for (int si = 0; si < n; si++) {
			sum2 = 0;
			for (int ei = si; ei < n; ei++) {
				sum2 += a[ei];
				System.out.println(ei + " " + si + " " + sum2);
			}

		}

	}

}
