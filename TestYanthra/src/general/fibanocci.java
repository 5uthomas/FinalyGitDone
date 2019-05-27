package general;

import java.util.Scanner;

public class fibanocci 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit");
		int n=sc.nextInt();
		int f1=0,f2=1,f3=1;
		System.out.print(f1+" ");
		System.out.print(f2+" ");
		while(f3<=n)
		{
			f3=f1+f2;
			f1=f2;
			f2=f3;	
			if(f3<=n)
			System.out.print(f3+" ");
		}
	}
}
