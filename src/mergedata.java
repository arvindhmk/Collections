import java.io.*;

public class mergedata
{
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter("E:\\java imp concepts telusko\\file\\file3.txt");

        BufferedReader br1 = new BufferedReader(new FileReader("E:\\java imp concepts telusko\\file\\file1.txt"));
        String line1 = br1.readLine();

        while (line1!=null)
        {
            pw.println(line1);
            line1= br1.readLine();
        }

        BufferedReader br2 = new BufferedReader(new FileReader("E:\\java imp concepts telusko\\file\\file2.txt"));
        line1 = br2.readLine();
        while (line1!=null)
        {
            pw.println(line1);
            line1= br2.readLine();
        }

        pw.flush();
        br1.close();
        br2.close();
        pw.close();
    }
}
