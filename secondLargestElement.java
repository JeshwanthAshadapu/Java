class secondLargestElement
{
    public static void main(String[]args)
    {
        int[]arr={1,30,40,12,25,42};
        int res=-1;
        int largest=0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>arr[largest])
            {
                res=largest;
                largest=i;
            }
            else if(res==-1 || arr[i]>arr[res])
            {
                res=i;
            }
        }
        System.out.println("second largest is "+arr[res]);
    }
}