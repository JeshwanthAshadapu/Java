import java.util.*;
class sumofdigit_to_one
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        do
        {
            n=sumofdigits(n);
        }while(n>9);
        System.out.println(n);
    }
    public static int sumofdigits(int x)
    {
        int sum=0;
        while(x>0)
        {
            sum+=x%10;
            x=x/10;
        }
        return sum;
    }
}