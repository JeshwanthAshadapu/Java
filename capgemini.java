class capgemini
{
    public static void main(String[]args)
    {
        int p=2,q=2,r=2;
        p=p<<1;
        if(p || q)
        {
            p=p&p;
            q=q&q;
        }
        r=r%r;
        System.out.println(p+q+r);
    }
}