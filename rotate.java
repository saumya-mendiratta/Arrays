package lec4;

import java.util.Scanner;

public class rotate {

	public static void main(String[] args) {
		 Scanner scn = new Scanner(System.in);
		    int rot = scn.nextInt();
		   
		    
		    int[] a={1,2,3,4,5};
		    int n=a.length;
		    int temp=0;
		    if(rot<0)
		    	rot=rot+ n;
		    for(int i=1;i<=rot;i++)
		    { temp=a[n-1];
		    	for(int j=n-1;j>=1;j--)
		    	{
		    		a[j]=a[j-1];
		    		if(j==1)
		    		a[0]=temp;
		    	}
		    	//a[0]=temp;
		    }
		    
		    for(int j=0;j<n;j++)
		    {
		    	System.out.print(a[j]);
		    }
		    
		    
	}

}
