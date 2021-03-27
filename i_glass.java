package self;

import java.util.Scanner;

public class i_glass {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int n=scn.nextInt();
		int row = 1;
		int nsp = (2*n)-1;
		int nst = 1;
		int dst =n, dsp=1;

		while (row <= 2*n+1) {
			int csp = 1, cst = 1;
			int kst =1, ksp=1;
			if(row<=n+1)
			{
			while (cst <= nst) {
				if(row==n+1 && cst==nst)
					System.out.print("0");
				else
				System.out.print("*");
				cst = cst + 1;
			}
			while (csp <= nsp) {
				// csp=1;
				System.out.print(" ");
				csp++;

			}
			
			cst = 1;
			while (cst <= nst) {
				// cst=1;
				if(cst<n+1)
				System.out.print("*");
				cst = cst + 1;
			}
			}
			else{
				while (kst <= dst+1) {
					
					System.out.print("*");
				kst++;
				}
				while (ksp <= dsp-2) {
					
					System.out.print(" ");
					ksp++;

				}
				
				kst = 1;
				while (kst <= dst+1) {
					
					if(kst<n+1)
					System.out.print("*");
					kst++;
				
			}
			}
			System.out.println();

			row++;
			if(row<=n+1)
			{nst++;
			nsp -= 2;
			}
			else
			{
				dst--;
				dsp+=2;
			}
		}
	}

}
