package TwoDarray;

import java.util.Scanner;

public class transposematrix 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows");
		int r=sc.nextInt();
		System.out.println("Enter number of colomns");
		int c=sc.nextInt();
		System.out.println("Enter array elements");
		int a[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		int transpose[][]=new int[c][r];
		System.out.println("After transpose");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				transpose[j][i]=a[i][j];
			}
		}
		for(int i=0;i<transpose.length;i++)
		{
			for(int j=0;j<transpose[0].length;j++)
			{
				System.out.print(transpose[i][j]+" ");
			}
			System.out.println();
		}
	}
}
