//this program is used to check whether there is a pair of elements in the array
//whose sum is equal to given target

import java.util.Scanner;
import java.util.HashSet;
class leadSquared1
{
    public static void main(String[]args)
    {
        HashSet<Integer>set=new HashSet<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int target=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            set.add(arr[i]);
        }
        boolean bl=false;
        for(int i=0;i<n;i++)
        {
            int res=target-arr[i];
            bl=set.contains(res);
            //System.out.print(bl+" ");
            if(bl==true)
            {
                System.out.print(arr[i]+","+res);
                break;
            }
        }
        if(bl==false)
        {
            System.out.println(-1);
        }
    }
}