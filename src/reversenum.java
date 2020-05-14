public class reversenum
{

    public static void main(String[] args)
    {
        int number=543;
        int revnum=0;
        int remain=0;

        while(number>0)
        {
            remain = number%10;
            revnum=revnum*10+remain;
            number=number/10;
        }
        System.out.println(revnum);
    }
}
