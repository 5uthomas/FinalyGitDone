package Patterns;

import java.util.Scanner;

public class pattern39 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the limit:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sp=n/2,ele=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=sp;j++)
			{
				System.out.print("  ");
			}
			int k=1;
			for(int j=1;j<=ele;j++)
			{
				if(j%2==1)
				{
					System.out.print((k++)+" ");
				}
				else
				{
					System.out.print("*"+" ");
				}
			}
			if(i<=n/2)
			{
				sp--;
				ele=ele+2;
			}
			else
			{
				sp++;
				ele=ele-2;
			}
			System.out.println();
		}
	}
}
