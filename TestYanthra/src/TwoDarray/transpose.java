package TwoDarray;

import java.util.Scanner;

public class transpose
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int r1=sc.nextInt();
		System.out.println("Enter the number of colomns");
		int c1=sc.nextInt();
		int a[][]=new int[r1][c1];
		System.out.println("Enter the elements");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("array elements are");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		int transpose[][]=new int[c1][r1];
		System.out.println("Transpose of the Matrix is:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
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
