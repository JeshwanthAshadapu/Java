abstract class oops3
{
    public int a;
    oops3()
    {
        a = 10;
    }
 
    abstract public void set();
     
    abstract final public void get();
 
}
 
class Test extends oops3
{
 
    public void set(int a)
    {
        this.a = a;
    }
 
    final public void get()
    {
        System.out.println("a = " + a);
    }
 
    public static void main(String[] args)
    {
        Test obj = new Test();
        obj.set(20);
        obj.get();
    }
} 