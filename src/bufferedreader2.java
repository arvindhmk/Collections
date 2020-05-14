import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class bufferedreader2
{
    public static void main(String[] args) throws IOException {
        FileReader fr1 = new FileReader("E:\\java imp concepts telusko\\file\\newfile2 - Copy.txt");
        BufferedReader br1 = new BufferedReader(fr1);

        int i = br1.read();

        while (i!=-1)
        {
            System.out.print((char)i);
            i = br1.read();
            //System.out.print("");
        }

        br1.close();
    }

}
