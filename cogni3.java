class cogni3
{
   /* Integer x1=new Integer(120);
    int x2=120;
    System.out.print(x1==x2);
    /*void display(int a)
    {
        System.out.print("Int");
    }
    void display(double b)
    {
        System.out.print("Double");
    }
    public static void main(String[]args)
    {
        new cogni3().display(100);
    }
    /*String msg;
    int noOfWords;
    public cogni3()
    {
        msg+="Thank You";
    }
    public cogni3(int noOfWords)
    {
        this.noOfWords=noOfWords;
        msg="Welcome";
        cogni3();
    }
    public static void main(String[]args)
    {
        cogni3 cog=new cogni3(5);
        System.out.print(cog.cogni3);
    }*/
    
    /*int x=10;
    public static void main(String[]args)
    {
        System.out.print(x);
    }*/
    private final int id;
    public cogni3(int id)
    {
        this.id=id;
    }
    public void updated(int newid)
    {
        id=newid;
    }
    public static void main(String[]args)
    {
        cogni3 c=new cogni3(42);
        c.updated(69);
        System.out.print(c.id);
    }
}