package self;

import java.util.Scanner;

public class double_arrow_st {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int n=scn.nextInt();
		int nsp=n-1;
		int nst =1;
		int row=1;
		int dsp=0;
		int dst=1;
		int gsp=2;
		int gst=n/2;
		int ysp=n-4;
		int yst=n/2;
		while(row<=n){
			int cst=1,csp=1;
			int kst=1,ksp=1;
			int jst=1,jsp=1;
			int ist=1,isp=1;
			if(row<=(n+1)/2)
			{
			while(csp<=nsp)
			{	System.out.print(" ");
		         csp++;
			}
			while(cst<=nst)
			{System.out.print("*");
			cst++;
			}
			if(row>1)
			{
			while(ksp<=dsp-1)
			{ System.out.print(" ");
			ksp++;
			}
			while(kst<=dst)
			{ System.out.print("*");
			kst++;
			}
			}
			}
			else {
				while(jsp<=gsp){
					System.out.print(" ");
					jsp++;
				}
				while(jst<=gst){
					System.out.print("*");
					jst++;
				}
				
				
				if(row==n-1)
				{	gsp=n-1;
				gst--;
				}
				else
				{	gsp+=2;
				gst--;}
				while(isp<=ysp){
					System.out.print(" ");
					isp++;
				}
				while(ist<=yst){
					if(row==n)
						System.out.print(" ");
					else
					System.out.print("*");
					ist++;
				}
				ysp-=2;
				yst--;
			}

	System.out.println();
		row++;
		nsp-=2;
		nst++;
	//	gsp++;
		//gst--;
		if(row>1 && row<=(n+1)/2)
		{dst++;
		dsp+=2;}
         
		
		}
	}
}
