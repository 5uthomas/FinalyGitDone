package general;
import java.util.Scanner;
public class armstrong
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		if(isArmstrong(num))
		{
			System.out.println("yes armstrong");
		}
		else
		{
			System.out.println("No...!");
		}
		
	}
	public static boolean isArmstrong(int num)
	{
		int sum=0;
		int number=num;
		int times=pow(num);
		while(num!=0)
		{
			int r=num%10;
			sum=sum+power(r,times);
			num=num/10;
    	}
		return number==sum;
	}
	public static int pow(int num) 
	{
		int pow=0;
		while(num!=0)
		{
			num=num/10;
			pow++;
		}
		return pow;
	}
	public static int power(int r,int times)
	{
		int product=1;
		while(times>0)
		{
			product=product*r;
			times--;
		}
		
		return product;
	}
}
