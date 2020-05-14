public class findmaxnuminarray
{
    public static void main(String[] args)
    {
        int[] givenarray = {4, 5, 6, 2, 8, 9};

        int max = Integer.MIN_VALUE;
        int len = givenarray.length;

        for (int i = 0; i < len; i++)
        {
            if(givenarray[i]>max)
            {
                max = givenarray[i];
            }
        }
        System.out.println("the largest number in array is "+ max);
    }
}
