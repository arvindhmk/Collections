import java.io.File;

public class findnumofdirectories
{
    public static void main(String[] args)
    {
        File ff = new File("E:\\java imp concepts telusko\\file");

        String[] ss =ff.list();

        for (String ss1:ss)
        {

            File ff1 = new File(ff,ss1);

            if(ff1.isDirectory())
            {
                System.out.println(ff1);
            }
        }

    }
}
