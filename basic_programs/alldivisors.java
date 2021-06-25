import java.util.Scanner;
class alldivisors
{
    public static void main(String[]args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i*i<n;i++)
        {
            if(n%i==0)
            {
                System.out.print(i+" ");
            }
        }
        for(int i=(int)Math.sqrt(n);i>=1;i--)  //or you can use simply i*i=n;
        {
            if(n%i==0)
            {
                System.out.print(n/i+" ");
            }
        }
    }
}