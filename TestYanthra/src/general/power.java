package general;

import java.util.Scanner;

public class power 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		System.out.println("enter the power");
		int p=sc.nextInt();
		int tot = 1;
		while(p!=0)
		{
			tot=tot*num;
			p--;
		}
		System.out.println(tot);
	}
}
