import java.io.File;

public class findnooffiles
{
    public static void main(String[] args)
    {
        int count =0;
        File fnum = new File("E:\\java imp concepts telusko\\file");
        String[] snum = fnum.list();

        for(String s : snum)
        {
            File f1num = new File(fnum,s);

            if(f1num.isFile()) {
                count++;
                System.out.println(s);
            }
        }
        System.out.println("total number of count "+count);

    }
}
