import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class addarrayelement
{
    public static void main(String[] args)
    {
//        Integer[] arry = {1,2,3,4,5,6,7};
//        List<Integer> ar = new ArrayList<Integer>(Arrays.asList(arry));
//        ar.add(8);
//        System.out.println(ar);

int[] primitivearray = {9,8,7,6,5,4,3};

Integer[] objectarray = new Integer[primitivearray.length];

for(int ar=0;ar<primitivearray.length;ar++)
{
    objectarray[ar]=Integer.valueOf(primitivearray[ar]);

    System.out.print(objectarray[ar]);
}
    }
}
