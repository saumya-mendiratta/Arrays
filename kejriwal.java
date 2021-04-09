package self;

import java.util.Scanner;

public class kejriwal {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int d=n;
		int a=0;
		int sume=0;
		int sumo=0;
		for(int i=1;i<=n;i++)
		{
			int c= scn.nextInt();
		    
			int o=sumo(c);
			int e=sume(c);
			
			if(e%4==0 || o%3==0)
			System.out.println("Yes");
			else 
			System.out.println("No");
		}

	}
	public static int sume(int d)
	{
		int a=0;
		int sume=0;
		
		while(d>0)
		{
			a=d%10;
			if(a%2==0)
				sume+=a;
			
			
			d=d/10;
			
		}
		//System.out.println(sume);
		return sume;
	}
	
	public static int sumo(int d)
	{
		int a=0;
		int sumo=0;
		
		while(d>0)
		{
			a=d%10;
			if(a%2!=0)
				sumo+=a;
			
			
			d=d/10;
			
		}
		//System.out.println(sumo);
		return sumo;
	}
	}
	


