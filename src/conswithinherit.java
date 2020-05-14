public class conswithinherit
{
    public conswithinherit()
    {
        System.out.println("parent constructor");
    }

    public void consinherit()
    {
        System.out.println("parent");
    }
}

class child extends conswithinherit
        {
            public child()
            {
                System.out.println("child constructor");
                super.consinherit();
            }

            @Override
            public void consinherit()
            {
                System.out.println("child");
            }

            public static void main(String[] args)
            {
                child ch =  new child();

            }
        }
