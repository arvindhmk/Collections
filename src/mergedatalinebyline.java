import java.io.*;

public class mergedatalinebyline
{
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter("E:\\java imp concepts telusko\\file\\file3.txt");
        BufferedReader br1 = new BufferedReader(new FileReader("E:\\java imp concepts telusko\\file\\file1.txt"));
        BufferedReader br2 = new BufferedReader(new FileReader("E:\\java imp concepts telusko\\file\\file2.txt"));

        String line1 = br1.readLine();
        String line2 = br2.readLine();

        while((line1!=null)||(line2!=null))
        {
            if(line1!=null)
            {
                pw.println(line1);
                line1=br1.readLine();
            }

            if(line2!=null)
            {
                pw.println(line2);
                line2=br2.readLine();
            }
        }

        pw.flush();
        pw.close();
        br1.close();
        br2.close();
    }
}
