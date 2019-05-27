package integerarrays;

import java.util.Scanner;

public class frequency 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		general g=new general();
		System.out.println("Enter the size of array a");
		int size=sc.nextInt();
		System.out.println("Enter elements");
		int a[]=g.readarray(size);
		for(int i=0;i<a.length;i++)
		{
			int count=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					a[j]='#';
				}
			}
			if(a[i]!='#')
			System.out.println(a[i]+" is present in "+count+" Times");
			
		}
		
	}
}
