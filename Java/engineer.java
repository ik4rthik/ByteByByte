import java.util.*;
class employee
{
	int salry;
	void display()
	{
		System.out.println("employee");
	}
	void calsalary()
	{
		System.out.println("the salary is"+salry);
	}
	}
	class engineer extends employee
	{
	}
	class main
	{
	public static void main(String args[])
	{
	Scanner S = new Scanner(System.in);
	employee e =new employee();
	engineer en =new engineer();
	System.out.println("Enter the salary of the employee");
	e.salry= S.nextInt();
	e.display();
	e.calsalary();
	System.out.println("enter the salary of the engineer");
	en.salry= S.nextInt();
	en.display();
	en.calsalary();
	S.close();
	}
}
