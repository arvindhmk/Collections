import java.io.File;
import java.io.IOException;

public class File1
{
    //create file

    public static void main(String[] args) throws IOException {
        File f= new File("f1.txt");
        System.out.println(f.exists());
        f.createNewFile();//file gets created here
        System.out.println(f.exists());
    }
}
