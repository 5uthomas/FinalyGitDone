package TwoDarray;
import java.util.Scanner;

public class read_and_display 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int r1=sc.nextInt();
		System.out.println("Enter the number of colomns");
		int c1=sc.nextInt();
		int a[][]=new int[r1][c1];
		System.out.println("Enter the elements");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		int smallest=a[0][0];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				if(smallest>a[i][j])
				{
					smallest=a[i][j];
				}
			}
		}
		System.out.println("smallest element in this array is:"+smallest);
	}
}
