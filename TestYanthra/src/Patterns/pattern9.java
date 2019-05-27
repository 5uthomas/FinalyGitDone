package Patterns;

import java.util.Scanner;

public class pattern9 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the limit");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=i;j>0;j--)
			{
				System.out.print("  ");
			}
			for(int j=n-i;j>0;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
