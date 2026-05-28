import java.util.*;
class transpose
{
	public static void main(String args[])
	{
		int a[][]=new int[50][50];
		int t[][]=new int[50][50];
		int i,j,row,col;
		Scanner s1=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER OF RAWS:");
		row=s1.nextInt();
		System.out.println("ENTER THE NUMBER OF COLUMNS:");
		col=s1.nextInt();
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.println("ENTER THE A["+i+"]["+j+"]th ELEMENT:");
				a[i][j]=s1.nextInt();
			}
		}
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				t[i][j]=a[j][i];
			}
		}
		System.out.println("MATRIX:");
		for(i=0;i<row;i++)
		{
			System.out.println("\n");
			for(j=0;j<col;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
		}
		System.out.println("TRANSPORSE MATRIX:");
		for(i=0;i<row;i++)
		{
			
			for(j=0;j<col;j++)
			{
				System.out.print(t[i][j]+"\t");
			}
			System.out.println("\n");
		}
		s1.close();
	}
}
