import java.io.File;
import java.io.IOException;

public class fileconstructors
{

    public static void main(String[] args) throws IOException {
    File f3 = new File("arvi","demo.txt");
    f3.createNewFile();
        System.out.println(f3.exists());
    }
}
