package self;

import java.util.Scanner;

public class oddevenplace {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int odd=0;
		int even=0;
		
		
		int c=digits(n);
		
	for(int i=1;i<=c;i++)
	{     int a=n%10;
		if(i%2==0)
			even+=a;
		else 
			odd+=a;
			n=n/10;
			
	}
		
	System.out.println(odd);	
	System.out.println(even);
		
	}

	public static int digits(int n){
		int count=0;
		int a=1;
		while(a!=0)
		{
			a=n%10;
			n=n/10;
			count++;
		}
		return (--count);
	}
}
