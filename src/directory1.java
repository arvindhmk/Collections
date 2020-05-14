import java.io.File;

public class directory1
{
    public static void main(String[] args)
    {
        File f2 = new File("arvi");
        System.out.println(f2.exists());
        f2.mkdir();//creating directory
        System.out.println(f2.exists());

        int count = 0;
      String[] s  =f2.list();
        for(String s1 : s)
        {
            File fi = new File(f2,s1);
            if(fi.isDirectory())
            count++;
            System.out.println(fi);
        }
        System.out.println(count);
    }
}
