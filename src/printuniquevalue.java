import java.io.*;

public class printuniquevalue
{
    public static void main(String[] arga) throws IOException {
        PrintWriter pw = new PrintWriter("E:\\java imp concepts telusko\\file\\fold1\\output2.txt");

        BufferedReader br = new BufferedReader(new FileReader("E:\\java imp concepts telusko\\file\\fold1\\input2.txt"));

        String line = br.readLine();

        while (line!=null)
        {
            boolean svailable = false;

            BufferedReader br1 = new BufferedReader(new FileReader("E:\\java imp concepts telusko\\file\\fold1\\output2.txt"));
            String target = br1.readLine();

            while (target!=null) {
                if (line.equals(target)) {
                    svailable = true;
                    break;
                }
                target = br1.readLine();
            }
                if(svailable==false)
                {
                    pw.println(line);
                    pw.flush();
                }
            line=br.readLine();
        }

    }
}
