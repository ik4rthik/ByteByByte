import java.util.*;
class secsmall
{
	public static void main(String args[])
	{
		int a[]=new int[50];
		int i,j,n,temp,small=0;
		Scanner s1=new Scanner(System.in);
		System.out.println("LIMIT: ");
		n=s1.nextInt();
		for(i=0;i<n;i++)
		{
			System.out.println("ELEMENTS:");
			a[i]=s1.nextInt();
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.print("SECOND SMALLEST:");
		for(i=0;i<n;i++)
		{
			small=a[1];
		}
		System.out.print(""+small);
		s1.close();
	}
}
		
