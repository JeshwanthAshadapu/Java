public class strings
{
    public static void main(String[]args)
    {
        String s=new String("Hello");
        String s3=new String("Hello");
        StringBuilder s1=new StringBuilder("World");
        System.out.println("length of string s "+s.length());
        System.out.println("char at 0th index "+s.charAt(0));
        System.out.println("cmparison of two strings "+s.equals(s3));
        System.out.println("finding index "+s.indexOf('l'));
        System.out.println("lexicographical comparison "+s.compareTo(s3));
        System.out.println("substring "+s.substring(0,2));

        //*****methods that are fit only to StringBuilder and StringBuffer*****//
    
        System.out.println("reverse of stringbuilder "+s1.reverse());
        System.out.println("appending "+s1.append(" world"));
        System.out.println("normal concatenation "+ (s1+" how are you?"));
        System.out.println("insert "+s1.insert(0,'Z'));
        System.out.println("replacing "+s1.replace(5,9,"jesh"));

        System.out.println("upper case "+s.toUpperCase());
        System.out.println("upper case "+s.toLowerCase());
    }
}