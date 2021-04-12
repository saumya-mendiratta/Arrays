package self;

import java.util.Scanner;

public class pattern_mountain {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int n=scn.nextInt();

		int row = 1;
		int nst=1;
		int nsp=2*n-3;
		int a=0;
		int b=1;
		
		

		while (row <= n) {
int z=1;
int d=row;
int w=row;
			int cst= 1;
			
			while (cst<= nst) {
				int c=a+b;
				
				System.out.print("\t"+z);
				 cst++;
				 z++;
				 }
			int csp=1;
			while(csp<=nsp)
			{
				System.out.print("\t"+" ");
				csp++;
			}
			cst=1;
			while (cst<= nst) {
				int c=a+b;
				
				if(row==n && cst==nst)
				{
					System.out.print("\t"+" " );
					//d--;
				}
				else if(row==n)
				{ d= w-1;
					System.out.print("\t"+d);
					w--;
				}
				else 
					System.out.print("\t"+d);
				 cst++;
				 d--;
				 
				 }
			
		
		System.out.println();
		
		row = row + 1;
		
			nst++;
			nsp-=2;
		}
}
	}
	