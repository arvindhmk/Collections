import java.io.FileWriter;
import java.io.IOException;

public class writedatatofile
{
    public static void main(String[] args) throws IOException
    {
        FileWriter fw = new FileWriter("writefile.txt",true);
        fw.write(100);
        fw.write("Arvi \n ndh");
        fw.write('\n');
        char[] ch = {'a','b','c'};
        fw.write(ch);
        fw.write('\n');
        fw.flush();
        fw.close();
    }
}
