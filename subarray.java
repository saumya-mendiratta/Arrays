package self;

import java.util.Scanner;

public class subarray {
	 static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		
		int t=scn.nextInt();
		while(t-->0)
		{int [] a=takeinput();
		subarray(a);
		}
	}
		 
		public static void subarray(int[] arr)
		{
			int n=arr.length;
       int start=0;
       int end=0;
      
      int  max_size=-1;
		   for (int si=0;si<n;si++)
		   {
			   for (int ei=si; ei<n;ei++)
			   { 
				   int count0=0;
			       int count1=0;
				  for( int k=si; k<=ei;k++)
				  {
						  if(arr[k]%2==0)
							  count0++;
						  else 
							  count1++;
						
						
				  }
				  if(count0==count1 )
				  { if(max_size<ei-si+1)
				  {
					  max_size=ei-si+1;
				  start =si;
				  end=ei;
				 
				  }
				  }
					
					  }
				 
			   }
			  
	
		   if(start!=end)
			   System.out.println(start+" "+ end);
		   else 
			   System.out.println("None");
		  
	}
		
		public static int[] takeinput()
		{
			
			//System.out.println("Size");
			int n = scn.nextInt();
			int[] arr= new int[n];
			 for (int i=0; i<arr.length; i++)
			 {
				 
				 int val= scn.nextInt();
				 arr[i]=val;
			 }
			 return arr;
		}
	}

