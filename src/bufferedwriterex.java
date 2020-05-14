import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class bufferedwriterex
{
    public static void main(String[] args) throws IOException
    {
        FileWriter fw = new FileWriter("E:\\java imp concepts telusko\\file\\buffwrite.txt",true);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write(100);
        bw.newLine();
        bw.write("hai hello");
        bw.newLine();
        char c[] ={'a','b','c','d'};
        bw.write(c);
        bw.newLine();
        bw.write("FILE HANDLING");
        bw.newLine();

        bw.close();
    }

}
