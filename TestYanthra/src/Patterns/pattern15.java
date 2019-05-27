package Patterns;

import java.util.Scanner;

public class pattern15
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the limit:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=0;
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(k%9+1+" ");
				k++;
			}
			System.out.println();
		}
	}
}
