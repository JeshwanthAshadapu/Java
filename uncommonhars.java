import java.util.Scanner;



class uncommonhars
{
    public static void printChars(String s1, String s2)
    {
        int l1=s1.length(),l2=s2.length();
        int[]present=new int[26];
        for(int i=0;i<26;i++)
        {
            present[i]=0;
        }
        for(int i=0;i<l1;i++)
        {
            present[s1.charAt(i)-'a']=1;
        }
        for(int i=0;i<l2;i++)
        {
            if(present[s2.charAt(i)-'a']==1 || present[s2.charAt(i)-'a']==-1)
            {
                present[s2.charAt(i)-'a']=-1;
            }
            else
            {
                present[s2.charAt(i)-'a']=2;
            }
        }
        for(int i=0;i<26;i++)
        {
            if(present[i]==2 || present[i]==1)
            {
                System.out.println((char)(i+'a')+" ");
            }
        }
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        printChars(s1,s2);
    }
}