package String;

import java.util.Scanner;

public class everyFirstCapital
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your sentence!");
		String st=sc.nextLine();
		char ch[]=st.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			
			if(i==0 && ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
			{
				count++;
				if(ch[i]>='a'&&ch[i]<='z')
				{
					ch[i]=(char)(ch[i]-32);
				}
			}
			else
			{
				if(ch[i]>='A'&&ch[i]<='Z')
				{
					ch[i]=(char)(ch[i]+32);
				}
			}
		}
		String newStr=new String(ch);
		System.out.println(newStr);
		System.out.println(count);
		
	}
}
