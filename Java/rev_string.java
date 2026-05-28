import java.util.*;
class rev_string
{
	public static void main(String args[])
	{
		int i,len;
		String s=new String();
		String rev=new String();
		Scanner s1=new Scanner(System.in);
		System.out.println("ENTER THE STRING: ");
		s=s1.nextLine();
		len=s.length();
		for(i=0;i<len;i++)
		{
			rev=rev+s.charAt(len-i-1);
		}
		System.out.println("REVERSED STRING: "+rev);
		s1.close();
	}
}
