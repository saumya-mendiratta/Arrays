package self;

import java.util.Scanner;

public class max_sum_circarr {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);

		
		//Scanner scn = new Scanner(System.in);
		int n= scn.nextInt();
		
		
		for(int i=1;i<=n;i++)
		{  int summ=0;
			int sum=0;
			int sum2=0;
			int[] a=takeinput();
			int min = Integer.MAX_VALUE;
			int l=a.length;
			int j;
			int m=0;
			int count=0;
			for(int p=0;p<a.length;p++)
			{
				if(a[p]<0)
					count++;
			}
			//System.out.println(count);
			if(count==a.length-1)
				System.out.println(summ);
			else
			{
			for ( j = 0; j< a.length; j++) 
				{
					if (a[j] < min)
						min = a[j];
	              
				}
			
			for ( j = 0; j< a.length; j++) 
			{
				if (a[j] ==min)
					 m=j;
              
			}
			
			int u=m;
			int p=m;
			int e=m;
			if(min<0)
			{	
			for(int k=p+1;k<a.length;k++)	
			{   if(a[k]>=0 && k==p+1 && k<a.length)
				sum+=a[k];
			else if(k<a.length )
				sum+=a[k];
			//System.out.println(sum);
			
				int q=0;
				if(k==(l-1))
				{   
					for(int o=u-1;o>=0;o--)
					{
						if(a[o]>=o)
						{	 q=o;
						break;
						}
					}
					for(int g=q;g>=0;g--)
					{  if(a[g]>=0 && g==u-1)
						sum2+=a[g];
					else if(g!=u-1)
						sum2+=a[g];
					
			
					}
				}
			}
		System.out.println(sum+sum2);
		}
			else{
				for(int y=0;y<l;y++)
				{
					sum2+=a[y];
				}
				System.out.println(sum2);
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
	
}