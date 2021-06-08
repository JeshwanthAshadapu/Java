import java.util.Scanner;
public class Main2
{
    public static void main(String[]args)
    {
        Scanner read=new Scanner(System.in);
        System.out.println("Enter the Employee Id");
        int id=read.nextInt();
         System.out.println("Enter the Employee Name");
        String name=read.next();
         System.out.println("Enter the Salary");
        double salary=read.nextDouble();
        Employee emp=new Employee(id,name,salary);
         System.out.println("Enter the Rating");
        int rating=read.nextInt();
        emp.findIncrementPercentage(rating);
        System.out.println("Incremented Salary "+emp.calculateincrementSalary());
    }
}