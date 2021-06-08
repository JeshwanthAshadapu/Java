import java.util.Scanner;
class binarytodecimal
{
    public static void main(String[]args)
    {
        String bin;
        Scanner sc=new Scanner(System.in);
        bin=sc.next();
        int sum=0;
        int base=1;
        for(int i=bin.length()-1;i>=0;i--)
        {
            if(bin.charAt(i)=='1')
            {
                sum=sum+base;
            }
            base=base*2;
        }
        System.out.println("Decima number is "+sum);
    }
}