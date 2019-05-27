package Patterns;

import java.util.Scanner;

public class pattern24 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the limit:");
		Scanner sc=new Scanner(System.in);
		String st="RAHUL";
		int n=st.length();
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(st.charAt(j));
			}
			System.out.println();
		}
	}
}
