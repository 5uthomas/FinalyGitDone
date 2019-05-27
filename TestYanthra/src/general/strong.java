package general;
public class strong
{
	public static void main(String[] args) 
	{
		int k;
		int sum;
		for(int i=1;i<=1000;i++)
		{
		    k=i;
			sum=0;
			while(k>0)
			{
				int r=k%10;
				sum=sum+fact(r);
				//System.out.println(fact(r));
				k=k/10;
			}
			if(i==sum)
			System.out.print(i+" ");
		}
		
	}

	private static int fact(int r) 
	{
		int fac=1;
		while(r!=0)
		{
			fac=fac*r;
			r--;
		}
		
		return fac;
	}
}
