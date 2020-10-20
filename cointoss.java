package lec4;

import java.util.Scanner;

public class cointoss {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int t=scn.nextInt();
		int limit=(int)Math.pow(2,t);
		int rem=0;
		for( int n=0; n<limit; n++)
		{int temp=n;
			for (int i=0;i<t;i++)
			{
				rem=temp%2;
				if(rem==1)
					System.out.print("H");
				else
					System.out.print("T");
				temp=temp/2;
			}
			System.out.println();
			//temp=temp/2;
		}


	}
}
