import java.util.*;
class checkchars
{
    public static boolean check(String s1, String s2)
    {
        char[]first=s1.toCharArray();
        char[]second=s2.toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);
        return Arrays.equals(first,second);
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String str1,str2;
        str1=sc.nextLine();
        str2=sc.nextLine();
        boolean b=check(str1,str2);
        if(b==true)
        {
            System.out.println(1);
        }
        else
        {
            System.out.println(0);
        }
    }
}