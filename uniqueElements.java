import java.util.*;
class uniqueElements
{
    public static void main(String[]args)
    {
        int[]arr={1,2,3,4,3,5,6,6};
        Arrays.sort(arr);
        int i=0;
        for(i=0;i<arr.length-1;i++)
        {
            if(arr[i+1]==arr[i])
            {
                continue;
            }
            else{
                System.out.print(arr[i]+" ");
            }
        }
        System.out.print(arr[i]);
        System.out.println();
        HashSet<Integer>set=new HashSet<Integer>();
        int arr2[]={3,3,3,5,1,6,3,5,4,8,9,2,9,8,2};
        for(int j=0;j<arr2.length;j++)
        {
            set.add(arr2[j]);
        }
        Iterator itr=set.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}