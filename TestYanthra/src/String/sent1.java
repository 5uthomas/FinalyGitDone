package String;

import java.util.Scanner;

public class sent1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentance 1");
		String s1=sc.nextLine();
		System.out.println("Enter the word you searching for");
		String s2=sc.nextLine();
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		int flag=0;
		for(int i=0;i<=ch1.length;i++)
		{
			int j=0;
			int k=i;
			while(j<ch2.length && k<ch1.length && ch1[k]==ch2[j])
			{
				j++;
				k++;
			}
			
			if(j==ch2.length)
			{
				if((i==0||ch1[i-1]==' ')&&(k==ch1.length||ch1[k]==' '))
				{
					flag=1;
				}
			}
		}
		if(flag==1)
		{
			System.out.println("Word is present");
		}
		else
		{
			System.out.println("Word is not present");
		}
	}
}
