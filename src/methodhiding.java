public class methodhiding
{
    public  void m1()
    {
        System.out.println("parent m1");
    }
}
class mhiding2 extends methodhiding
{
    public  void m1()
    {
        System.out.println("child m2");
    }

    public static void main(String[] args)
    {
        methodhiding obj1 = new methodhiding();//parent - parent
        obj1.m1();

        mhiding2 obj2 = new mhiding2(); //child to child
        obj2.m1();

        methodhiding obj3 = new mhiding2();//parent ref to child
        obj3.m1();

    }
}