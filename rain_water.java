package self_afterarray;

import java.util.Scanner;

public class rain_water {

	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		
		int t=scn.nextInt();
		while(t-->0)
		{
			int[] a=takeinput();
			
			System.out.println(rain(a));;
		}

	}
	public static int[] takeinput()
	{
		
		int n = scn.nextInt();
		int[] arr= new int[n];
		 for (int i=0; i<arr.length; i++)
		 {
			 
			 int val= scn.nextInt();
			 arr[i]=val;
		 }
		 return arr;
	}
	
	public static int rain(int[] arr)
	{
		int[] lmax=new int[arr.length];
		int[] rmax= new int[arr.length];
		
		lmax[0]=arr[0];
		for(int i=1; i<lmax.length;i++)
		{
			if(arr[i]<=lmax[i-1])
				lmax[i]=lmax[i-1];
			else
				lmax[i]=arr[i];
		}
		
		//display(lmax);
		 rmax[arr.length-1]=arr[arr.length-1];
		
		for (int j = arr.length-1; j >0 ; j--)
		{

			if(arr[j-1]<=rmax[j])
				rmax[j-1]=rmax[j];
			else
				rmax[j-1]=arr[j-1];
		}
	//	display(rmax);
		int water=0;
		for(int k=0;k<arr.length;k++)
		{
			water+=Math.min(lmax[k], rmax[k])-arr[k];
		}
		return water;
		
	}
	
public static void display(int[] arr){
		
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+ " ");
		System.out.println();
		
	}
}
