package integerarrays;

import java.util.Scanner;

public class union
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		general g=new general();
		System.out.println("Enter the size of array A");
		int asize=sc.nextInt();
		System.out.println("Enter elements");
		int a[]=g.readarray(asize);
		System.out.println("Enter the size of array B");
		int bsize=sc.nextInt();
		System.out.println("Enter elements");
		int b[]=g.readarray(bsize);
		int c[]=new int[asize+bsize];
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			c[k++]=a[i];
		}
		
		for(int i=0;i<b.length;i++)
		{
			int flag=0;
			for(int j=0;j<a.length;j++)
			{
				if(b[i]==a[j])
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				c[k++]=b[i];
			}
		}
		int result[]=new int[k];
		for(int i=0;i<result.length;i++)
		{
			result[i]=c[i];
		}
		System.out.println("Final array");
		g.displayarray(result);
	}
}
