package String;

import java.util.Scanner;

public class correct_word 
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
		for(int i=0;i<senarr.length;i++)
		{
			int j=0;
			int k=i;
			while(k<senarr.length&&j<wordpartarr.length&&senarr[k]==wordpartarr[j])
			{
				j++;
				k++;
			}
			if(j==wordpartarr.length)
			{
				if((i==0||senarr[i-1]==' ')&&(k==senarr.length||senarr[k]==' '))
				{
					flag=1;
				}
			}
		}
		if(flag==1)
		{
			System.out.println("yes word");
		}
		else
		{
			System.out.println("no such word present ");
		}
	}
}
//i==0&&senarr[k]==' '==>first word identification
//(senarr[k]==' ')&&(senarr[i-1]==' ')==>before and after a word space identification
//(k==senarr.length)&&(senarr[i-1]==' ')==>last word idenfication

