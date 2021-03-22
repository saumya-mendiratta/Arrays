package self;

import java.util.Scanner;

public class array_max_hkblk {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		int[] a =takeinput();
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			{
			//	a[0] = max;
				if (a[i] > max)
					max = a[i];
              
			}
			
		}
		System.out.println(max);

	}

		
	
	
	public static int[] takeinput()
	{
		
		Scanner scn = new Scanner(System.in);
		int n= scn.nextInt();
		int[] arr= new int[n];
		 for (int i=0; i<arr.length; i++)
		 {
			 
			 int val= scn.nextInt();
			 arr[i]=val;
		 }
		 return arr;
	}
}