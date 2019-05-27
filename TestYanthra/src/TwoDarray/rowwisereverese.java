package TwoDarray;

import java.util.Scanner;

public class rowwisereverese 
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
		System.out.println("Before Reverse");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		int t=0;
		System.out.println("After reverse");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length/2;j++)
			{
				t=a[i][j];
				a[i][j]=a[i][a[i].length-1-j];
				a[i][a[i].length-1-j]=t;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
