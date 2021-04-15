package self;

import java.util.Arrays;
import java.util.Scanner;

public class triplet_sum {

	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {

		int[] arr=takeinput();
		//int[] arr=bubbleSort(a);
		Arrays.sort(arr);
		int t= scn.nextInt();
		int l=0;
		
		for( int i=0 ;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				for (int k=j+1;k<arr.length;k++)
				{
					if(arr[i]+arr[j]+arr[k]==t)
					{		
						System.out.println(arr[i] + ", "+arr[j]+" and " + arr[k]);
						
					}
					
				}
			}
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
