package lec4;

public class maxarray {

	public static void main(String[] args) {
		
		
		int[] a = { -1, -2, -3, -4, -5 };
		
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < a.length; i++) {
			{
				a[0] = max;
				if (a[i] > max)
					max = a[i];

			}
		}
		System.out.println(max);

	}
}