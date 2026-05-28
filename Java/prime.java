import java.util.*;
class prime
{
	public static void main(String args[])
	{
		Scanner s1=new Scanner(System.in);
		int n,i,j;
		int p[]=new int[50];
		System.out.println("Enter the limit:");
		n=s1.nextInt();
		System.out.println("The prime numbers upto "+n+"are:");
		for(i=2;i<n;i++)
		{
			int s=0;
			for(j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					s=1;
					break;
				}
			}
			if(s==0)
			{
				p[i]=i;
			}
		}
		for(i=1;i<n;i++)
		{
			if(p[i]!=0)
			{
				System.out.print(p[i]+"\t");
			}
		}
		s1.close();
	}		
}	
