package self;

import java.util.Scanner;

public class chewbacca {


	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		
		long n= scn.nextLong();
		long a=n%n;
		long temp =0;
		long c=1;
		int k=count(n);
		System.out.println(k);
		while(n>0)
		{
			
				a=n%10;
			if(k==1 && a==9)
				a=a;
			else
				{if((9-a)<a)
				a=9-a;
				}
			temp+=a*c;
           c =c*10;
			n=n/10;	
			
			k--;
		}
	System.out.println(temp);
	}
	public static int count(long n)
	{  int count =1;
	int a=0;
		while(n!=0)
		{
			n=n/10;
			count++;
		}
		return(--count);
		
	}

}
