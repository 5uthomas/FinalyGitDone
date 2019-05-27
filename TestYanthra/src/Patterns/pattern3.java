import java.util.Scanner;

public class pattern3 
{
	public static void main(String[] args)
	{
		System.out.println("Enter the Limit:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}
