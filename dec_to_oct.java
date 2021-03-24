package self;

import java.util.Scanner;

public class dec_to_oct {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int n=scn.nextInt();
		int mux=1;
		
		int ans =0;
		while(n!=0)
		{
			int rem=n%8;
			n=n/8;
		
		ans+=rem*mux;
		mux=mux*10;
		}
		
		System.out.println(ans);
		
		

	}

}
