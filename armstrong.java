package lec4;

import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int lo = scn.nextInt();
		int hi = scn.nextInt();
		
      //  int c=digits(lo);
        // System.out.println(c);
		printarmstrong(lo, hi);
		//int d=sum(lo);
		//System.out.println(d);

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
	
	public static int sum(int n){
		int sum=0;
		int a=1;
		int b=digits(n);
		while(a!=0)
		{ a=n%10;
		
			sum+=Math.pow(a,b);
			n=n/10;
		}
		return sum;
		
	}
	public static void printarmstrong(int lo, int hi) {
		for (int i = lo; i <= hi; i++) {
			boolean res = isarmstrong(i);
			if (res)
				System.out.println(i);
		}
	}
	public static boolean isarmstrong(int n) {
		
		int b=sum(n);
		if(b==n)
			return true;
		else 
			return false;
	}
	
	
	
	
	
}
