package Patterns;

import java.util.Scanner;

public class pattern28
{
	public static void main(String[] args)
	{
		String st="RAGHU";
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
