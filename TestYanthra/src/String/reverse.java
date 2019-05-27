package String;

import java.util.Scanner;

public class reverse 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the String:");
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		char ch[]=st.toCharArray();
		//System.out.println(ch.length);
		String rs="";
		for(int i=0;i<ch.length;i++)
		{
			int j=i;
			while(i<ch.length&&ch[i]!=' ')
			{
				i++;
			}
			int k=i-1;
			while(k>=j)
			{
				rs=rs+ch[k];
				k--;
			}
			if(i<ch.length)
				rs=rs+ch[i];
		}
		System.out.println(rs);
	}
}
