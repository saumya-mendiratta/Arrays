package self;

import java.util.Scanner;

public class hour_glass {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int n=scn.nextInt();
int k=n;
int z=1;
int f=1;
int j=1;
		int row = 1;
		
		int nsp =0 ;
		int nst = 2*n+1;
		int tst;
		int tsp;
		int dsp=n ;
		
		int dst=1  ;
		
		while (row <=2*n+1) {
			//int count=nst;
			
			int csp = 1, cst = 1;
			if(row<=n)
			{
			while (csp <= nsp) {
				System.out.print("  ");
				csp++;
			}
			int count=nst/2;
			j=1;
			while (cst <= nst) {
				//int count=nst/2;
				if(cst<=(nst/2))
				{ int h=k;
				System.out.print(count+" ");
				count--;
				
				}
				else if(cst==(nst+1)/2)
				{System.out.print("0 ");
				}
				
				else{
					System.out.print(j+" ");
					j++;
					
				}
				//j=1;
				
				cst = cst + 1;
				
			}
				
			
			}
			else if(row>n && row<=2*n+1){
			
			 tst=1;
			tsp=1;
			while (tsp <= dsp) {
				System.out.print("  ");
				tsp++;
			}
			int flag=dst/2;
			f=1;
			while (tst <= dst) {
				if(tst==(dst+1)/2)
				{
				System.out.print("0 ");
				//z++;
				}
				else if(tst<=(dst-1)/2)
				{z=1;
					System.out.print(flag+" ");
				flag--;
				}
				else
				{System.out.print(f+" ");
				f++;
					
				}
				tst = tst + 1;
				
			}
			
			dst+=2;
			dsp--;
			}
			System.out.println();

			row++;
			
			
				nsp++;
				nst-=2;
				
			
		}

	}
}
