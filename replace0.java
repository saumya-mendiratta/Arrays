package self;

import java.util.Scanner;

public class replace0 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		long n = scn.nextLong();
		long d=n;
		long a=0;
		int count =0;
		if(n==0)
			System.out.println("5");
		else
		{
		while(d!=0)
		{
			a=d%10;
			
			if(a==0)
			
			{	n = n+ 5*(long)(Math.pow(10,count));
				
			}
			d=d/10;
			
			count++;
			
		}
		
		
		System.out.println(n);
	}
	}

}
