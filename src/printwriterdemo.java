import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class printwriterdemo
{
    public static void main(String[] arga) throws FileNotFoundException
    {
        PrintWriter pw = new PrintWriter("E:\\java imp concepts telusko\\file\\printwr.txt");
        pw.write(100);
        pw.println("");
        pw.println(100);
        pw.println('A');
        pw.println(20.99);
        pw.println(true);
        pw.println("Hello");
        char[] cha = {'A','B','B','D'};
        pw.println(cha);
        pw.flush();
        pw.close();
    }
}
