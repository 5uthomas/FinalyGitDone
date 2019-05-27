package Patterns;

import java.util.Scanner;

public class pattern42
{
	public static void main(String[] args)
	{
		System.out.println("Enter the limit:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ele=1;
		int lim=(2*n)-1;
		for(int i=1;i<=lim;i++)
		{
			int k=1;
			for(int j=1;j<=ele;j++)
			{
				System.out.print(k+" ");
				k++;
				
			}
			System.out.println();
			if(i<n*2/2)
			ele=ele+1;
			else
			ele=ele-1;
		}
	}
}
