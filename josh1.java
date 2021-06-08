import java.util.*;
class josh1
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int n=num;
        int count=0,rev=0;
        while(n>0)
        {
            int rem=n%10;
            if(rem==0)
            {
                count+=1;
            }
            else
            {
                rev=rev*10+rem;
            }
            n=n/10;
        }
        rev=rev*(int)(Math.pow(10,count));
        System.out.println(num+rev);
    }
}