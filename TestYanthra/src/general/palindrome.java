package general;

import java.util.Scanner;

public class palindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number To check");
		int n=sc.nextInt();
		int t=n;
		int reverse=0;
		while(n!=0)
		{
			int r=n%10;
			reverse=(reverse*10)+r;
			n=n/10;
		}
		if(reverse==t)
			System.out.println("yes");
		else
			System.out.println("no");
	}
}
