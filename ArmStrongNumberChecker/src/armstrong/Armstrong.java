package armstrong;

public class Armstrong 
{
	public double logic(int n)
	{ 
		int num=n;
	  int count=0;
	  while(num!=0)
	  {
		  num=num/10;
		  count++;
	  }
	  int sum = 0;
		while(n!=0)
		{
			int last=n%10;
			int res=(int)(Math.pow(last,count));
			sum=sum+res;
			n=n/10;
		}
		return sum;
	}
}
