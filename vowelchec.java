import java.util.*;
public class vowelchec
{
    public static void main(String[]args)
    {
        int v=0;
        int c=0;
        String s;
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        //Your code here
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
            {
                v+=1;
            }
            else
            {
                c+=1;
            }
        }
        System.out.println(c+" "+v);
        
        if(v>c)
        System.out.print("Yes");
        else if(c>v)
        System.out.print("No");
        else
       System.out.print("Same");
    }
}