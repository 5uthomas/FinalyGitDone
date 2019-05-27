package integerarrays;

import java.util.Scanner;

public class general
{
	public int[] readarray(int size)
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		return a;
	}
	public void displayarray(int a[])
	{
		for(int i=0;i<a.length;i++) 
		{
			System.out.print(a[i]+" ");
		}
	}
}
