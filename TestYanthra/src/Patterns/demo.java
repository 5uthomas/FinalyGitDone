package Patterns;

import java.util.Date;

public class demo
{
	public static void main(String[] args)
	{
		Date d = new Date();
//		String date1 = d.toString();
//		System.out.println(date1);
//		String date2 = date1.replaceAll(":", "_");
//		System.out.println(date2);
		//System.out.println(d.toString());
		System.out.println(d.toString().replaceAll(":","_"));
	}
}
