import java.io.File;
import java.io.IOException;

public class createnewfileatdifferentloc
{
    public static void main(String[] args) throws IOException {
        File f4 = new File("E:\\java imp concepts telusko\\file","newfile.txt");
        f4.createNewFile();
        System.out.println(f4.exists());
        System.out.println(f4.isFile());
        System.out.println(f4.isDirectory());

    }
}
