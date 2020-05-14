import static java.lang.Math.sqrt;

public class primenumber
{

    public static void main(String[] args)
    {
        int num = 43;

        boolean isPrime=true;

        for(int i = 2; i<= sqrt(num); i++)
        {
            if(num%i==0)
            {
                isPrime=false;
                break;
            }
        }

        if(isPrime)
        {
            System.out.println("the given number is prime");
        }
        else
        {
            System.out.println("the given number is not prime");
        }
    }

}
