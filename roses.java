package self;

import java.util.Scanner;

public class roses {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		int t= scn.nextInt();
		
		for(int k=0;k<t;k++)
		{
			int[] arr=takeinput();
			int[] arrr=bubbleSort(arr);
			int mon= scn.nextInt();
			int count=0;
			
			int ll=0;
			int mm=0;
			
			for( int i=0 ;i<arrr.length;i++)
			{
				for(int j=i+1;j<arrr.length;j++)
				{
					if(arrr[i]+arrr[j]==mon)
					{	
					
						
						ll=arrr[i];
						mm=arrr[j];
						count++;
					
					}
				}
				
			
			}
			
				System.out.println("Deepak should buy roses whose prices are "+ll+ " and "+ mm);
			
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
	  static int[] bubbleSort(int[] arr) {  
	        int n = arr.length;  
	        int temp = 0;  
	         for(int i=0; i < n; i++){  
	                 for(int j=1; j < (n-i); j++){  
	                          if(arr[j-1] > arr[j]){  
	                                 //swap elements  
	                                 temp = arr[j-1];  
	                                 arr[j-1] = arr[j];  
	                                 arr[j] = temp;  
	                         }  
	                          
	                 }  
	         }  
	         return arr;
	  
	    }  
}
