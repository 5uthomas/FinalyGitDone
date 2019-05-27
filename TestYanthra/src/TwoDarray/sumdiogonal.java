package TwoDarray;

import java.util.Scanner;

public class sumdiogonal 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int r=sc.nextInt();
		System.out.println("Enter the number of colomns");
		int c=sc.nextInt();
		int a[][]=new int[r][c];
		System.out.println("Enter the elements");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Array before reverse are");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Array elements re after reverse");
		int t=0;
		for(int i=0;i<r/2;i++)
		{
			for(int j=0;j<c;j++)
			{
				if(i==j)
				{
					t=a[i][j];
					a[i][j]=a[r-1-i][c-1-i];
					a[r-1-i][c-1-i]=t;
				}
				if(i+j==r-1)
				{
					t=a[i][j];
					a[i][j]=a[j][i];
					a[j][i]=t;
				}
			}
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
