package self_afterarray;

import java.util.Scanner;

public class help_ramu {

	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		
		int t=scn.nextInt();
		for(int v=0;v<t;v++)
		{
			int c1=scn.nextInt();
			int c2=scn.nextInt();
			int c3=scn.nextInt();
			int c4=scn.nextInt();
			
			int n=scn.nextInt();
			int m=scn.nextInt();
			
			int[] r=new int[n];
			
			for(int rick=0;rick<r.length;rick++)
			r[rick]=scn.nextInt();
			
			int[] c=new int[m];
			
			for(int cab=0;cab<c.length;cab++)
				c[cab]=scn.nextInt();
			
			int min=0;
			for(int k=0;k<r.length;k++)
			{
				 min+=Math.min(r[k]*c1, c2);
			}
				
			int rickmin=Math.min(min, c3)	;
			
			int min2=0;
			for(int g=0;g<c.length;g++)
			{
				 min2+=Math.min(c[g]*c1, c2);
			}
				
			int cabmin=Math.min(min2, c3);
			
			int finalcost=Math.min(rickmin+cabmin, c4);
			
			System.out.println(finalcost);
		}

	}

}
