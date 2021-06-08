import java.util.*;
import java.io.FileOutputStream;
import java.io.File;
import java.io.*;
class filehandling
{
    public static void main(String[]args)
    {
        try
        {
            String filename="newfile.txt";
            String content="Welcome to my world";
            FileOutputStream fos=new FileOutputStream(filename,true);
            byte[]b=content.getBytes();
            fos.write(b);
            fos.close();
            String currentdir=System.getProperty("user.dir");
            File folder=new File(currentdir);
            String[]files=folder.list();
            Arrays.sort(files);
            for(String file: files)
            {
                System.out.print(file+" ");
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}