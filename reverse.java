package lec4;

import java.util.Scanner;

public class reverse {

	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		
		int arr[] =takeinput();
		int n=arr.length-1;
		//int[] b= new int[n];
		int a=0;
		int temp=0;
		while(a<=(arr.length-1)/2)
		{	temp=arr[a];
			arr[a]= arr[n];
		arr[n]=temp;
			n--;
			a++;
		}
		
		for ( int j=0;j<arr.length;j++)
		{
			System.out.println(arr[j]);
		}
	}
	public static int[] takeinput()
	{
		
		
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
