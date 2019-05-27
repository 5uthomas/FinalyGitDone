package String;

import java.util.Scanner;

public class word_present
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your sentence!");
		String sen=sc.nextLine();
		System.out.println("Enter your word you searching for!");
		String wordpart=sc.nextLine();
		char senarr[]=sen.toCharArray();
		char wordpartarr[]=wordpart.toCharArray();
		int flag=0;
		int count=0;
		for(int i=0;i<sen.length();i++)
		{
			int j=0;
			int k=i;
			while(k<senarr.length && j<wordpartarr.length && senarr[k]==wordpartarr[j] )
			{
				j++;k++;
			}
			if(j==wordpartarr.length)
			{
				flag=1;
				count++;
				i=k-1;
				
			}
		}
		if(flag==0)
		{
			System.out.println("Not Present");
		}
		else
		{
			System.out.println("Yes Present");
			System.out.println("Prsent in "+count+" times");
		}
		
	}
}
