package self_afterarray;

import java.util.Scanner;

public class calc_sum {

	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		
		
	int[] arr=takeinput();
	
	int sum=0;
	int res=0;
	for(int i=0;i<arr.length;i++)
	{
		sum+=arr[i];
	}
	
	int n= scn.nextInt();
	for(int k=0;k<n;k++)
	{
		int s=scn.nextInt();
	}
		res=(int)Math.pow(2, n)*sum;
		res=res%(1000000007);
		System.out.println(res);

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
