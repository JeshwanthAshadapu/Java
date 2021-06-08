import java.util.*;
public class distinct
{
    public static void main(String[]args)
    {
        HashSet<Integer>set=new HashSet<>();
        Scanner sc=new Scanner(System.in);
        int[]arr=new int[5];
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
            set.add(arr[i]);
        }
        System.out.println(set.size());
        System.out.println(set);
    }
}