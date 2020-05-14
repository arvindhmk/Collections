import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class filereader
{
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("E:\\java imp concepts telusko\\file\\newfile2 - Copy.txt");
        int i = fr.read();

        while (i!= -1)
        {
            System.out.print((char)i);
            i=fr.read();
        }
        fr.close();
    }
}
