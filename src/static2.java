public class static2
{
    static int b =0;
    int c=0;
//    static
//    {
//        System.out.println("block1");
//    }
//
//    static
//    {
//        System.out.println("block2");
//    }


    public static void main(String[] args)
    {
        System.out.println("main method");

        static2 obj1 = new static2();
        obj1.b=2000;
        obj1.c=5001;



        static2 obj2 = new static2();
        obj2.b=3000;
        obj2.c=5002;


        System.out.println(obj1.b);
        System.out.println(obj1.c);
        System.out.println(obj2.b);
        System.out.println(obj2.c);
    }
}
