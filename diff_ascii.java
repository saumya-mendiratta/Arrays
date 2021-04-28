package self_afterarray;

import java.util.Scanner;

public class diff_ascii {

	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {

		String s=scn.next();
		diff(s);

	}


	public static void diff(String s) {
		
		//String b="";
		char[] a=new char[s.length()];
		for (int i = 0; i<s.length()-1; i++)
		{
		
			char c=s.charAt(i);
			int j=(int)c;
			char d=s.charAt(i+1);
			int k=(int)d;
			int diff =k-j;
			//System.out.println(j+" "+k);
			System.out.print(c);
			System.out.print(diff);
			//System.out.print((char)d);
			
		}

	System.out.print(s.charAt(s.length()-1));
	}

}
