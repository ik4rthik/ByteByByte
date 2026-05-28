//STUDENT DETAILS
//KARTHIK S
//ROLL NO:35
import java.util.*;
class student
{
    public static void main(String args[])
    {
        Scanner S1 = new Scanner(System.in);
        int roll;
        String name,cls;
        System.out.println("Enter your Name:");
        name = S1.nextLine(); 
        System.out.println("Enter your Class:");
        cls = S1.nextLine();
        System.out.println("Enter your Roll No:");
        roll = S1.nextInt();

        System.out.println("NAME: "+name);

        System.out.println("CLASS: "+cls);

        System.out.println("ROLL NO: "+roll);
        S1.close();
    }
}
