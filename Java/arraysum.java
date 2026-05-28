import java.util.*;
class arraysum
{
	public static void main(String args[])
	{
	  int sum=0;
	  int a[]=new int[50];
	  Scanner S1=new Scanner (System.in);
	  System.out.println("enter the limit");
	  int length=S1.nextInt();
	  System.out.println("enter the elements");
	  for(int i=0;i<length;i++)
	  {
	  	a[i]=S1.nextInt();
	  }
	   for(int i=0;i<length;i++)
	  {
	  	sum=a[i]+sum;
	  }
	  System.out.println("the sum is"+sum);
	  S1.close();
	 }
}	  		  
