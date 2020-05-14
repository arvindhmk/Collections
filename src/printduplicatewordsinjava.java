import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class printduplicatewordsinjava
{

    public static void main(String args[])
    {
    String str = "Hello how are you? how was your jounrney?";

    String[] strary = str.split(" ");

    int arylen = strary.length;

        HashMap<String,Integer> hmp = new HashMap<String,Integer>();

        for (String arwords : strary)
        {

            if(hmp.containsKey(arwords)==false)
            {
                hmp.put(arwords,1);
            }
            else
            {
                int oldval = hmp.get(arwords);
                int newval = oldval+1;
                hmp.put(arwords,newval);
            }
        }

        System.out.println(hmp);

        Set<Map.Entry<String,Integer>> smp = hmp.entrySet();

        for (Map.Entry<String,Integer> data: smp)
              {
                  if (data.getValue()>1)
                  {
                      System.out.println("duplicate words in character:"+data.getKey());
                      System.out.println("duplicate words in character:"+data.getValue());

                  }

        }
    }
}
