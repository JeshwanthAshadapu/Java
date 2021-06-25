import java.util.Scanner;
class primenumber
{
    public static void main(String[]args)
    {
        int n;boolean flag=true;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n<=1)
        {
            flag=false;
        }
        else
        {
            for(int i=2;i*i<=n;i++)
            {
                if(n%i==0)
                {
                    flag=false;
                }
            }
        }
        if(flag==true)
        {
            System.out.println(n+" is a prime number");
        }
        else{
            System.out.println(n+" is not a prime number");
        }
    }
}