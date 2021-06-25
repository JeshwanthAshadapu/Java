import java.util.Scanner;
class primefactors
{
    public static void main(String[]args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n<=1)
        {
            
        }
        else{
            for(int i=2;i*i<=n;i++)
            {
                while(n%i==0)
                {
                    System.out.print(i+" ");
                    n=n/i;
                }
            }
            if(n>1)
            {
                System.out.print(n);
            }
        }
    }
}