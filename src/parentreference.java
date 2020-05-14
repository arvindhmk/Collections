abstract public class parentreference
{
    int a1=10;
    public void m1()
    {
        System.out.println("method 1 from class A");
    }

    public static void main(String[] args)
    {
        parentreference obj = new two();
        System.out.println(obj.a1);
        //System.out.println(obj.a1);

        two obj2 = new two();
        //obj2.
    }
}

class two extends parentreference
{
    int a2=11;
    public void m2()
    {
        System.out.println("method 2 from class B");
    }
}
