package self_afterarray;

import java.util.Scanner;

public class odd_even_replace {


	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		

		String s= scn.next();
	System.out.println(odd_even(s));
	//odd_even(s);
		
	}

	public static  char[] odd_even(String s)
	{
		char[] a= new char[s.length()];
		for(int i=0;i<s.length();i++)
		{
			if((i+1)%2==0)
			{
				int j=(int)(s.charAt(i)) -1;
				//System.out.println((char)j);
				//a[i]=s.replace(s.charAt(i),(char)j );
				a[i]=(char)j;
				
				
			}
			else
			{
				int j=(int)s.charAt(i) +1;
				//System.out.println((char)j);
				//a=s.replace(s.charAt(i),(char)j );
			a[i]=(char)j;
				
				
			}
			
			
		}
		return a;
		
		
	}
	
}
