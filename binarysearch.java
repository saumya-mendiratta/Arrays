package lec4;

import java.util.Scanner;

public class binarysearch {

	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
   
   
   int[] arr=takeinput();
    int val = scn.nextInt();
    int c=binary(arr,val);
    System.out.println(c);

	}
	public static int binary(int[] arr,int val){
		 int lo=0;
		    int hi=(arr.length)-1; 
		    int mid=0;
		    
		     while(lo<=hi)
		     {    
		    	 mid=(lo+hi)/2;
		    	if(val>arr[mid])
		    		lo=mid+1;
		    	else if(val<arr[mid]) 
		    	hi=mid-1;
		    	else 
		    		return mid;
		    	
		     }
		     return-1;
		  
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