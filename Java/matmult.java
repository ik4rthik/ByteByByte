import java.util.*;
class matmult
{
	public static void main(String args[])
	{
		int a[][]=new int[50][50];
		int b[][]=new int[50][50];
		int m[][]=new int[50][50];
		int row1,col1,i,j,row2,col2;
		Scanner s1=new Scanner(System.in);
		System.out.println("NO: OF RAWS IN FIRST MATRIX: ");
		row1=s1.nextInt();
		System.out.println("NO: OF COLUMNS IN FIRST MATRIX: ");
		col1=s1.nextInt();
		System.out.println("NO: OF RAWS IN SECOND MATRIX: ");
		row2=s1.nextInt();
		System.out.println("NO: OF COLUMNS IN SECOND MATRIX: ");
		col2=s1.nextInt();
		for(i=0;i<row1;i++)
		{
			for(j=0;j<col1;j++)
			{
				System.out.println("Enter the a["+i+"]["+j+"] element:");
				a[i][j]=s1.nextInt();
			}
		}
		for(i=0;i<row2;i++)
		{
			for(j=0;j<col2;j++)
			{
				System.out.println("Enter the b["+i+"]["+j+"] element:");
				b[i][j]=s1.nextInt();
			}
		}
		if(row1==col2)
		{
			for(i=0;i<row1;i++)
			{
				for(j=0;j<col2;j++)
				{
					for(int k=0;k<col1;k++)
					{
						m[i][j]+=a[i][j]*b[j][i];
					}
				}
			}
			System.out.println("The product of matrix is:");
			for(i=0;i<col1;i++)
			{
				System.out.println("\n");
				for(j=0;j<row2;j++)
				{
					System.out.print(m[i][j]+"\t");
				}
			}
		}
		else
		{
			System.out.println("The Matrix multiplication is not possible:");
		}
		s1.close();
	}
}
