import java.util.*;
import java.util.function.Consumer;

public class removeduplicatecharsfromstring
{

    public static void main(String[] args)
    {
    String str1="abbacddceffeghheijjkllmmnooppqqrrsstvuvwxyyyz";

    char[] str1ary = str1.toCharArray();

    ArrayList<Character> ll = new ArrayList<Character>();
        for (char ch: str1ary)
        {
         if(!ll.contains(ch))
         {
             ll.add(ch);
         }
        }
        System.out.println(ll);

        HashSet<Character> hs = new HashSet<>(ll);
        for (char ch2:ll )
        {
            hs.add(ch2);

        }

        System.out.println(hs);
    }
}
