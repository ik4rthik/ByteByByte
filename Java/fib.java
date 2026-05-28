import java.util.*;
class fib
{
    public static void main (String args[])
    {
        Scanner s= new Scanner(System.in);
        int fib[]=new int[50];
        int n,i;
        System.out.println("ENTER THE LIMIT OF THE SERIES: ");
        n=s.nextInt();
        fib[0]=0;
        fib[1]=1;
        for(i=2;i<n;i++)
        {
            fib[i]=fib[i-1]+fib[i-2];
	}
        System.out.println("THE FIBANNOCI SERIES"+n+" NUMBERS IS:");
        for(i=0;i<n;i++)
        {
            System.out.println(""+fib[i]);
        }
        s.close();
    }
}
