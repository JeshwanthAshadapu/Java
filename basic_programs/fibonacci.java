import java.util.Scanner;
class fibonacci
{
    public static void main(String[]args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a=0,b=1;
        System.out.print(a+" "+b+" ");
        for(int i=1;i<=n-2;i++)
        {
            int c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}