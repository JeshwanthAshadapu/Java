import java.util.Scanner;
class pyramid
{
    public static void main(String[]args)
    {
       Scanner sc=new Scanner(System.in);
       char ch=sc.next().charAt(0);
       int n=sc.nextInt();
       int l=1;
       for(int i=1;i<=(n/2)+1;i++)
       {
           for(int j=1;j<=(n/2)+1-i;j++)
           {
               System.out.print(" ");
           }
           for(int k=0;k<l;k++)
           {
               System.out.print(ch);
           }
           l=l+2;
           for(int j=1;j<=(n/2)+1-i;j++)
           {
               System.out.print(" ");
           }
           System.out.println();
       }
    }
}