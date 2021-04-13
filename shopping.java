package self;

import java.util.Scanner;

public class shopping {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
	
		for(int i=1;i<=t;i++)
		{
			int m = scn.nextInt();
			int n = scn.nextInt();
			int a=1;
			int h=2;
			int aa=1;
			int hh=2;
			
			if(m==0 && n!=0)
				{
				System.out.println("Harshit");
				
				}
			else if(n==0 && m!=0)
				{
				System.out.println("Aayush");
				
				}
			else
			{
			while(t!=0)
			{    
				if(m==n)
				{
					 if(m<=aa)
						{
						System.out.println("Aayush");
						break;
						}
					 else if (n<=hh)
					 {
							System.out.println("Harshit");
							break;
							}
						 
				}
				if(m<=a && n>h)
				{  
				
					System.out.println("Harshit");
				
					break;
					
				}
				else if (m>a && n<=h)
				{   
				
					System.out.println("Aayush");
					break;
					
				}
			
				
				
				a+=2;
				h+=2;
				aa+=a;
				hh+=h;
				//System.out.println(aa);
				//System.out.println(hh);
				
			}
			}
			
		}
		

	}

}