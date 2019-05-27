import java.util.Scanner;

public class pattern1 
{
	public static void main(String[] args)
	{
		System.out.println("Enter the limit:");
		Scanner sc=new Scanner(System.in);
		int lim=sc.nextInt();
		for(int i=0;i<lim;i++)
		{
			for(int j=0;j<lim;j++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}
