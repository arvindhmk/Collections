import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class printduplicatevalues
{

    public static void main(String[] args)
    {

        String input = "hello how do you do? hello";

        String[] words = input.split(" ");
        Map<String, Integer> mp = new HashMap<String, Integer>();

        for (String str : words)
        {
            if(mp.get(str)!=null)
            {
                mp.put(str,mp.get(str)+1);
            }
            else
            {
                mp.put(str,1);
            }
        }

        Set<Map.Entry<String,Integer>> smp=mp.entrySet();

        for(Map.Entry<String,Integer> data: smp)
        {
            if (data.getValue()>1)
            {
                System.out.println(data.getKey());
            }
        }




    }
}
