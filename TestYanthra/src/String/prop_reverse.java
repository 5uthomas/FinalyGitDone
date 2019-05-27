package String;

import java.util.Scanner;

public class prop_reverse 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the String:");
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		String rs="";
		char ch[]=st.toCharArray();
		for(int i=ch.length-1;i>0;i--)
		{
			int j=i;
			while(i>=0 && ch[i]!=' ')
			{
				i--;
			}
			int k=i+1;
			while(k<=j)
			{
				rs=rs+ch[k];
				k++;
			}
			if(i>=0)
			{
				rs=rs+ch[i];
			}
			
		}
		System.out.println(rs);
	}
}
