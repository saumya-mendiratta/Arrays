package lec4;

import java.util.Scanner;

public class linearsearch {

	static Scanner scn = new Scanner(System.in);
	  
	public static void main(String[] args) {
		
		//System.out.println("element to be searched");
		int[] a= takeinput();
		Scanner scn = new Scanner(System.in);
		int val = scn.nextInt();
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(val==a[i])
			{
				//System.out.println("Found at INDEX "+i);
				System.out.println(i);
			}
		else
			count++;
		}
		if (count==a.length)
			System.out.println("-1");
		
	
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
