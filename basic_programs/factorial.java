import java.util.Scanner;
class factorial
{
    public static void main(String[]args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n<0)
        {
            System.out.print("Please enter a positive number");
        }
        else
        {
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.print(fact);}
    }
}
