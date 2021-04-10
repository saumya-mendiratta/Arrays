package self;

import java.util.Scanner;

public class pascal_triangle {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int n=scn.nextInt();
		int row,col ;
		int val=1;
		for(row =0;row<n;row++)
		{
			val=1;
			for(col=0;col<=row;col++)
			{	
				
			{	System.out.print(val+"\t");
			val=val*(row-col)/(col+1);
			}
			}
		
		System.out.println();
		}
		}

	}
