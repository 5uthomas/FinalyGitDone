package integerarrays;

import java.util.Scanner;

public class mergeSort
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		general g=new general();
		System.out.println("Enter the size of array a");
		int asize=sc.nextInt();
		System.out.println("Enter the size of array b");
		int bsize=sc.nextInt();
		System.out.println("Enter array elements of A");
		int a[]=g.readarray(asize);
		System.out.println("Enter array elements of B");
		int b[]=g.readarray(bsize);
		System.out.println("Array elements of A is");
		g.displayarray(a);
		System.out.println("Array elements of B is");
		g.displayarray(b);
		System.out.println();
		int c[]=new int[asize+bsize];
		int i=0,j=0,k=0;
		while(i<a.length&&j<b.length)
		{
			if(a[i]<b[j])
			{
				c[k++]=a[i++];
			}
			else
			{
				c[k++]=b[j++];
			}
		}
		while(i<a.length)
		{
			c[k++]=a[i++];
		}
		while(j<b.length)
		{
			c[k++]=b[j++];
		}
		System.out.println("Array elements are:");
		g.displayarray(c);
	}
}
