import java.io.*;
class filehandling
{
	public static void main(String args[])
	{
		try
		{
			FileReader reader=new FileReader("input.txt");
			FileWriter writer=new FileWriter("output.txt");
			int character;
			System.out.println("reading from the file and writing to the file");
			while((character=reader.read())!=-1)
			{
				writer.write(character);
				System.out.print((char) character);
			}
			System.out.println();
			reader.close();
			writer.close();
			System.out.println("\nFile content written successfully to output file.");
		}
		catch(FileNotFoundException e)
		{
		System.out.println("filenot found exception occurred");
		}
		catch(IOException e)
		{
			System.out.println("IO  exception occurred");
		}
		catch(Exception e)
		{
			System.out.println("error occured");
		}
}
}

