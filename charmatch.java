import java.util.Scanner;
class charmatch
{
    
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String str;
        char ch;
        int count=0;
        str=sc.nextLine();
        ch=sc.next().charAt(0);
        int len=str.length();
        if(len<2)
        {
            System.out.println(-1);
        }
        else
        {
            if(str.charAt(0)==str.charAt(len-1))
            {
                for(int i=0;i<len;i++)
                {
                    if(str.charAt(i)==ch)
                    {
                        count+=1;
                    }
                }
                System.out.println(count);
            }
            else{
                System.out.println(0);
            }
        }
    }
}