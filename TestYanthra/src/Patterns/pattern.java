package Patterns;

import java.util.Scanner;

public class pattern 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the limit:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j%2);
			}
			System.out.println();
		}
	}
}
