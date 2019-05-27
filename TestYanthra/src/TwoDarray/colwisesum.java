package TwoDarray;

import java.util.Scanner;

public class colwisesum
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
			System.out.println();
			int colsum[]=new int [a[0].length];
			for(int i=0;i<a[0].length;i++)
			{
				colsum[i]=0;
				for(int j=0;j<a.length;j++)
				{
					colsum[i]=colsum[i]+a[j][i];
				}
			}
			System.out.println("column wise sum is");
			for(int i=0;i<colsum.length;i++)
			{
				System.out.print(colsum[i]+" ");
			}
			
	}
}
