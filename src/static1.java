public class static1
{
    static int a = 25;

    public static void method1()
    {
        a=30;
        System.out.println("under static method "+a);

    }
    public void method2()
    {
        a=35;
        System.out.println("under static method "+a);
    }

    public static void main(String[] args)
    {
        System.out.println("Under main method");

        static1 obj = new static1();
        method1();
        obj.method2();
        //method2(); cannot call the non static method inside static block



    }
}
