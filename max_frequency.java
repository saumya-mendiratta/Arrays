package self_afterarray;

import java.util.Scanner;

public class max_frequency {

	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
	
		String s= scn.next();
		freq(s);
	}

	public static  void freq(String s) {
		int[] arr=new int[s.length()];
		int[] arr2=new int[s.length()];
		
		
		for (int i = 0; i <s.length();  i++)
		{
			int count = 0;
			for(int j=0;j<s.length();j++)
			{	
				if(s.charAt(i)==s.charAt(j))
					count++;
				
				
			}
			arr[i]=count;
		

		}
	    for(int j=0;j<arr.length;j++)
	    {
	    	arr2[j]=arr[j];
	    }
	    	
    
	    int k=max(arr);
	  
		for(int d=0;d<arr2.length;d++)
		{
			if(arr2[d]==k)
			{	
				//System.out.print(arr[d]+ " ");
				System.out.println(s.charAt(d));
			break;
				
			}
		}
		if(s.length()==1)
			System.out.println(s);
		
		
	}
	public static  int max(int[] a)

	{
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			{
				a[0] = max;
				if (a[i] > max)
					max = a[i];
              
			}
			
		}
		return max;
	}
}
