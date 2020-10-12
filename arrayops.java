package lec4;

import java.util.Scanner;

public class arrayops {
          static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int[] a =takeinput();
		display(a);
	}
	
	
	public static int[] takeinput()
	{
		
		System.out.println("Size");
		int n = scn.nextInt();
		int[] arr= new int[n];
		 for (int i=0; i<arr.length; i++)
		 {
			 
			 int val= scn.nextInt();
			 arr[i]=val;
		 }
		 return arr;
	}
	
	public static void display(int[] arr){
		
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+ " ");
		System.out.println();
		
	}


}
