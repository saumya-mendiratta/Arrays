package self_afterarray;

import java.util.Scanner;

public class compression {

	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		


		String s=scn.next();
		comp(s);
	}

	public static void comp(String s) {
		
		
		char[] a=new char[s.length()];
		int count =0;
		for (int i = 0; i<s.length(); i+=count)
		{
			 count =0;
		for(int j=i;j<s.length();j++)
		{
			if(s.charAt(i)==s.charAt(j))
				count++;
			else 
			break;
			
			
		}
		if(count>1 )
		{	
			System.out.print(s.charAt(i));
		    System.out.print(count);
				
			}
		else
			System.out.print(s.charAt(i));
		
		}

	
	}

}
