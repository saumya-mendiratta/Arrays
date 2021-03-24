package self;

import java.util.Scanner;

public class cumulative {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int sum=0;
		
     while(scn.hasNext())
       {  
		int n = scn.nextInt();
		
		sum+=n;
		if(sum>=0)
			System.out.println(n);
		else
			break;
		
    	   
       }

	}

}
