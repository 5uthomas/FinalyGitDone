package TwoDarray;

import java.util.Scanner;

public class rowWiseBoggest 
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
		System.out.println("Row wise reverse ");
		
		System.out.println("Array elements before are");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		int big[]=new int[c];
		for(int i=0;i<c;i++)
		{	
			big[i]=a[0][i];
			for(int j=0;j<r;j++)
			{
				if(big[i]<a[j][i])
				{
					big[i]=a[j][i];
				}
			}
		}
		System.out.println("Array elements after are");
		for(int i=0;i<big.length;i++)
			{
				System.out.print(big[i]+" ");
			}
		
	}
}
