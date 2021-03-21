package self;

import java.util.Scanner;

public class alex {

	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		
		int[] arr=takeinput();
		int n= scn.nextInt();
		
		for(int i=0;i<n;i++)
		{ 
			int count=0;
			
			int mon= scn.nextInt();
			int k= scn.nextInt();
			
			for(int j=0;j<arr.length;j++)
			{  
				if(mon%arr[j]==0)
					count++;
				
			}
			System.out.println(count);
			 if(count>=k)
				 System.out.println("Yes");
			 else
				 System.out.println("No");
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
