public class convertIntegertoint
{
    public static void main(String[] args)
    {

    Integer[] wraparray = {1,2,33,4,556,6};
    int[] primitivearr = new int[wraparray.length];

    for(int i=0;i<wraparray.length;i++)
    {
        primitivearr[i]=wraparray[i].intValue();

        System.out.print(primitivearr[i]+" ");
    }
    }
}
