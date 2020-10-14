package lec4;

public class subarray {

	public static void main(String[] args) {
	
		int [] a={10,20,30,40};
		int n= a.length;
		int sum=0;
	//	int sum2=0;
		
		   for(int i=1;i<=n;i++)
			sum+=i;
       
		   for (int si=0;si<n;si++)
		   {
			   for (int ei=si; ei<n;ei++)
			   {  int sum2=0;
				  for( int k=si; k<=ei;k++)
				  {
					  System.out.print(a[k]+" ");
					//  sum2+=a[k];
					 // System.out.print("->"+ sum);
				  }
				//  System.out.print("->"+ sum2);
				  System.out.println();
			   }
			
		   }
		  
	}
 
	}


