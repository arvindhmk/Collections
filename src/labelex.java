public class labelex
{
    public static void main(String[] args)
    {
        int i=2;
        l1:
        {

            if (i < 5) {
                break l1;
            }
            System.out.println(i);
        }
    }
}
