package self_afterarray;

import java.util.Scanner;

public class form_min_seq {

	public static void main(String[] args) {
	
		

		Scanner scn = new Scanner(System.in);
		int n= scn.nextInt();
		
		for(int i=0 ;i<n;i++)
		{
			String s=scn.next();
			
			int[] arr=new int[s.length()+1];
			int number =1;
			for(int j=0;j<=s.length();j++)
			{
				if(j==s.length() || s.charAt(j)=='I')
				{
					arr[j]=number++;
					
				
				
				for(int k=j-1; k>=0 && s.charAt(k)!='I';k--)
					
					arr[k]=number++;
				
			
				}
			}
			display(arr);
			
			
				}
			
			}
		
	
public static void display(int[] arr){
		
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]);
		System.out.println();
		
	}
}
