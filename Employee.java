public class Employee
{
    private int employeeId;
    private String employeeName;
    private double salary;
    private int incrementPercentage;
    
    public int getEmployeeId()
    {
        return employeeId;
    }
    public String getEmployeeName()
    {
        return employeeName;
    }
    public double getSalary()
    {
        return salary;
    }
    public void setEmployeeId(int id)
    {
        employeeId=id;
    }
    public void setEmployeeName(String name)
    {
        employeeName=name;
    }
    public void setSalary(double sal)
    {
        salary=sal;
    }

    public Employee(int employeeId,String employeeName,double salary)
    {
        this.employeeId=employeeId;
        this.employeeName=employeeName;
        this.salary=salary; System.out.println("Enter the Employee Id");
    }
    public void findIncrementPercentage(int rating)
    {
        if(rating==1 || rating==2)
        {
            incrementPercentage=10;
        }
        else if(rating==3 || rating==4)
        {
            incrementPercentage=20;
        }
        else if(rating==5)
        {
            incrementPercentage=30;
        }
    }
    public double calculateincrementSalary()
    {
        double incrementedSalary=salary+((salary*incrementPercentage)/100);
        return incrementedSalary;
    }
}