package self;

import java.util.Scanner;

public class Calcu {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
			int flag=0;
			
			do 
		{     char c;
		
		c=scn.next().charAt(0);
		
				if(c == '*')
				
			{ int n1 = scn.nextInt();
			int n2 = scn.nextInt();
				int sum=0;
			    sum=n1*n2;
			    System.out.println(sum);
			}
				
				else if(c=='%')
			{ 
				int n1 = scn.nextInt();
				int n2 = scn.nextInt();
				int sum=0;
				if(n2!=0)
				{   sum=n1%n2;
			    System.out.println(sum);
				}
			}
				
				else if(c=='/')
			{ int n1 = scn.nextInt();
			int n2 = scn.nextInt();
			int sum=0;
				if(n2!=0)
				{ sum=n1/n2;
			    System.out.println(sum);
				}
			}
				
				else if(c=='+')
			{ int n1 = scn.nextInt();
			int n2 = scn.nextInt();
			int sum=0;
				
			    sum=n1+n2;
			    System.out.println(sum);
			}
				
				else if(c=='-')
			{ int n1 = scn.nextInt();
			int n2 = scn.nextInt();
			int sum=0;
				
			    sum=n1-n2;
			    System.out.println(sum);
			}
				else if(c=='x' || c=='X'){
				flag++;
			   
				}	else
		{System.out.println("Invalid operation. Try again.");
			    	
			    	}
			  
			
		}while(flag<1);

	}
	}
