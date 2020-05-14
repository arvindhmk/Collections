import java.io.*;
import java.nio.Buffer;

public class mergedatafromallfiles
{
    public static void main(String[] args) throws IOException
    {
        PrintWriter pw = new PrintWriter("E:\\java imp concepts telusko\\file\\fold1\\file3.txt");
        File f = new File("E:\\java imp concepts telusko\\file\\fold1");

        String[] s = f.list();

        for(String s1:s)
        {

            File f1 = new File(f,s1);
            BufferedReader br = new BufferedReader(new FileReader(f1));

            String line = br.readLine();
            while (line!=null)
            {
                pw.println(line);
                line=br.readLine();
            }
        }
pw.flush();

    }
}
