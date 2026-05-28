import java.io.*;
class main
{
	public static void main(String args[])
	{
		try
		{
			int []a={1,2,3,4,5};
			a[10]=10;
		}
		catch(Exception e)
		{
			System.out.println("Arrayoutofindex exception");
		}
	finally
	{
		System.out.println("finally block executed successfully");
	}
}
}
/*Arrayoutofindex exception
finally block executed successfully

