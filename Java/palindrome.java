import java.util.Scanner;
class palindrome{
public static void main(String[] args)
{
int n,rem,rev=0,temp;
System.out.println("enter the value=");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
temp=n;
while(n!=0)
{
rem=n%10;
rev=(rev*10)+rem;
n=n/10;
}
if(rev==temp)
{
System.out.println("number is palindrome");
}
else
{
System.out.println("number is not palindrome");
}
sc.close();
}
}
