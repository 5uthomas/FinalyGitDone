package integerarrays;

import java.util.Scanner;

public class intersection 
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
		int flag;
		for(int i=0;i<a.length;i++)
		{
			flag=0;
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					flag=1;
					break;
				}
			}
			if(flag==1)
			{
					c[k++]=a[i];
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
