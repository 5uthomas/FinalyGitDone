package TwoDarray;

import java.util.Scanner;

public class rowwiseproduct 
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
		System.out.println("Array elements are");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println(a.length);
		System.out.println(a[0].length);
		int product[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			product[i]=1;
			for(int j=0;j<a[0].length;j++)
			{
				product[i]=product[i]*a[i][j];
			}
			System.out.println("Product of each row is "+product[i]);
		}
	}
}
