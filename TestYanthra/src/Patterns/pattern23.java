package Patterns;

import java.util.Scanner;

public class pattern23 
{
	public static void main(String[] args)
	{
		System.out.println("Enter the limit:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(64+j)+"");
			}
			System.out.println();
		}
	}
}
