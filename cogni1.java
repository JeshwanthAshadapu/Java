public class cogni1
{
    public static void main(String[] args)
    {
       /* for(int i=0;i<3;i++)
        {
            switch(i)
            {
                case 0: break;
                case 1: System.out.println("one");
                case 2: System.out.println("two");
                case 3: System.out.println("three");
            }
        }
        System.out.println("done");*/
        int i=1,j=-1;
        switch(i)
        {
            case 0,1:j=1;
            case 2: j=2;
            default: j=0; 
        }
        System.out.println("j= "+j);
    }
}