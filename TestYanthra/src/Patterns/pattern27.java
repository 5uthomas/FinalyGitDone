package Patterns;

import java.util.Scanner;

public class pattern27
{
	public static void main(String[] args)
	{
		System.out.println("Enter the limit:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=0;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(64+k+j)+" ");	
			}
			k++;
			System.out.println();
			
		}
	}
}
