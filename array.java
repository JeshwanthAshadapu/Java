import java.util.Scanner;
class array
{
    public static void main(String[]args)
    {
        int[]arr=new int[3];
        Scanner sc=new Scanner(System.in);
        char ch;
        ch=sc.nextChar();
        for(int i=0;i<3;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<3;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
}