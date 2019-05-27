package integerarrays;

import java.util.Scanner;

public class insertFullArray 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		general g=new general();
		System.out.println("Enter the size of array a");
		int size=sc.nextInt();
		System.out.println("Enter elements");
		int a[]=g.readarray(size);
		System.out.println("Enter the size of array adding array");
		int addsize=sc.nextInt();
		System.out.println("Enter elements for adding array");
		int add[]=g.readarray(addsize);
		System.out.println("from which position you want to add?");
		int index=sc.nextInt();
		int c[]=new int[a.length+add.length];
		for(int i=0;i<a.length;i++)
		{
			if(i<index-1)
			{
				c[i]=a[i];
			}
			else
			{
				c[i+add.length]=a[i];
		
			}
		}
		for(int i=0;i<add.length;i++)
		{
			c[index+i-1]=add[i];
		}
		System.out.println();
		System.out.println("Final array");
		g.displayarray(c);
		
		
	}
}
