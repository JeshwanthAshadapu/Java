 
class printing
{
    public static void main(String [] args) 
    {
        String arr [] = new String[5];
        for (int x=0; x < args.length; x++)
            arr[x] = arr[x];
        System.out.println(arr[1]);
        //printing s = new printing();
        //s.start();
    }

    void start() 
    {
        int a = 3;
        int b = 4;
        System.out.print(" " + 7 + 2 + " ");
        System.out.print(a + b);
        System.out.print(" " + a + b + " ");
        System.out.print(foo() + a + b + " ");
        System.out.println(a + b + foo());
    }

    String foo() 
    {
        return "foo";
    }
}