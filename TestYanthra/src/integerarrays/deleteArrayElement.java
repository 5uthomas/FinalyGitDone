package integerarrays;

import java.util.Scanner;

public class deleteArrayElement 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		general g=new general();
		System.out.println("Enter the size of array a");
		int size=sc.nextInt();
		System.out.println("Enter elements");
		int a[]=g.readarray(size);
		System.out.println("which position?");
		int index=sc.nextInt();
		int c[]=new int[a.length-1];
		System.out.println("Array before");
		g.displayarray(a);
		for(int i=0;i<c.length;i++)
		{
			if(i<index-1)
			{
				c[i]=a[i];
			}
			else
			{
				c[i]=a[i+1];
			}
		}
		System.out.println();
		System.out.println("Final array");
		g.displayarray(c);
		
	}
}
