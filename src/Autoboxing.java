import org.w3c.dom.ls.LSOutput;

public class Autoboxing
{
   static Integer x=123;
   static Integer y=123;

   static int i=y.intValue();//AutoUnboxing
   static Integer x1=128;
   static Integer y1=128;

    static Boolean x2 = false;
    static Boolean y2 = false;

    public static void main(String[] args)
    {
        System.out.println(i);
        System.out.println(x==y);
        System.out.println(x1==y1);
        System.out.println(x2==y2);
    }
}
