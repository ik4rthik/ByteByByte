import java.io.*;
class filehandling
{
	public static void main(String args[])
	{
		String content="this is test data";
		try{
				FileWriter writer=new FileWriter("test.txt");
				writer.write(content);
				System.out.println("content written to file");
				writer.close();
				}
		catch(Exception e)
		{
				System.out.println("Error occured");
		}
		try
		{
				FileReader reader=new FileReader("test.txt");
				int data;
				while((data=reader.read())!=-1)
				{
					System.out.print((char) data);
				}
				System.out.println();
				reader.close();
}
		catch(Exception e)
		{
				System.out.println("error occured");
		}
	}
}


				
	
