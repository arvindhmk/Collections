import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class filreader2
{
public static void main(String[] args) throws IOException {
    File fr1 = new File("E:\\java imp concepts telusko\\file\\newfile2 - Copy.txt");
    char[] ch = new char[(int) fr1.length()];
    FileReader fr2 = new FileReader(fr1);
    fr2.read(ch);

    for(char ch1 : ch)
    {
        System.out.print(ch1);
    }

    fr2.close();
}
}
