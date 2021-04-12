package self;

import java.util.Scanner;

public class pattern_fibbo {
	
	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int n=scn.nextInt();

		int row = 1;
		int nst=1;
		int a=0;
		int b=1;
		
		

		while (row <= n) {

			int cst= 1;
			
			while (cst<= nst) {
				int c=a+b;
				
				if(row==1)
					System.out.print("\t"+a);
				else if(row==2)
					System.out.print("\t"+b);
				else
				{ int k=3;
				while(k<=row)
				{   a=b;
					b=c;
					c=a+b;
					System.out.print("\t"+c);	
					
					k++;
					break;
				}
				
				}
				 cst++;
				 }

		System.out.println();
			row = row + 1;
			nst++;
		}
}
	}
	