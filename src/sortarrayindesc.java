import java.util.Arrays;
import java.util.Collections;

public class sortarrayindesc
{
    public static void main(String[] args)
    {
        Integer[] num = {9,4,2,5,6};

        Arrays.sort(num, Collections.reverseOrder());
        System.out.println(Arrays.toString(num));
    }
}
