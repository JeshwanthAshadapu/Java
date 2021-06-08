import java.util.Scanner;
class reverseString
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        StringBuilder str2=new StringBuilder(str);
        int start=0,end=str2.length()-1;
        while(start<end)
        {
            char temp;
            temp=str2.charAt(start);
            str2.setCharAt(start,str2.charAt(end));
            str2.setCharAt(end,temp);
            start++; end--;
        }
        System.out.println(str2);
    }
}