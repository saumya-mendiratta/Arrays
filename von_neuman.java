package self;

import java.util.Scanner;

public class von_neuman {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int n=scn.nextInt();
		for(int i=1;i<=n;i++)
		{   int bin=scn.nextInt();
			int mux=1;
		
		int ans =0;
		while(bin!=0)
		{
			int rem=bin%10;
			bin=bin/10;
		
		ans+=rem*mux;
		mux=mux*2;
		}
		
		System.out.println(ans);
		
			}

	}

}
