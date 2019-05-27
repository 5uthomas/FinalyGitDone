package String;

import java.util.Scanner;

public class Palindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		int i=0,last=s.length()-1;
		int flag=0;
		while(i<last)
		{
			if(s.charAt(i)!=s.charAt(last))
			flag=1;
			i++;
			last--;
		}
		if(flag==0)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
}
