package integerarrays;

import java.util.Scanner;

public class nthBiggest 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		general g=new general();
		System.out.println("Enter the size of array a");
		int size=sc.nextInt();
		System.out.println("Enter elements");
		int a[]=g.readarray(size);
		System.out.println("which biggest");
		int big=sc.nextInt();
		
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					count++;
				}
			}
			if(count==big-1)
			{
				System.out.println(big+"th Biggest Element is :"+a[i]);
			}
		}
		
	}
}
