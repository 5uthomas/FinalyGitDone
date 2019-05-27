package Patterns;

import java.util.Scanner;

public class pattern7 
{
	public static void main(String[] args)
	{
		System.out.println("Enter the Limit:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=n;i>=0;i--)
		{
			for(int j=n;j>i;j--)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			
		}
	}
}
