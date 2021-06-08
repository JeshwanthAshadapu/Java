import java.util.Scanner;
import java.util.HashSet;
public class goodbad
{
    public static void main(String[]args)
    {
        HashSet<Integer>set=new HashSet<Integer>();
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int [] arr=new int[n];
        boolean flag=true;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            set.add(arr[i]);
            if(!(arr[i]>=1 && arr[i]<=n))
            {
                flag=false;
                break;
            }
        }
        boolean flagsort=true;
        for(int i=1;i<n;i++)
        {
            if(arr[i-1]<=arr[i])
            {
                continue;
            }
            else
            {
                flagsort=false;
                break;
            }
        }
        boolean uniq=true;
        System.out.println(set);
        if(set.size()!=n)
        {
            System.out.println(set.size());
            uniq=false;
        }
        if(flag==false || flagsort==true || uniq==false)
        {
            System.out.println("Bad");
        }
        else{
            System.out.println("Good");
        }

        
    }
}