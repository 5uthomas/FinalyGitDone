package demos;

import java.util.Date;

public class date 
{
	public static void main(String[] args) 
	{
		Date d=new Date();
		String s=d.toString();
		System.out.println(s);
		String s2=s.replaceAll(":", "_");
		System.out.println(s2);
	}
}
