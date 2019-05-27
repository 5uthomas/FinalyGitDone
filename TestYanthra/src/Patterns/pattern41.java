package Patterns;

import java.util.Scanner;

public class pattern41 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the limit:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		 for(int i=0;i<n;i++)
		 {
			 for(int j=0;j<n;j++)
			 {
				 if((i==n/2||j==n/2||i==j||(i+j)==n-1)&&(i!=n/2||j!=n/2))
				 System.out.print(" * ");
				 else
				 System.out.print("   ");
			 }
			 System.out.println();
		 }
	}
}
