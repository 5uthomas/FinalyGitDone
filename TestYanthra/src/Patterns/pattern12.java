package Patterns;

import java.util.Scanner;

public class pattern12 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the limit:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=n;j>=n-i;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
