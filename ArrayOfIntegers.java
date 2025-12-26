import java.util.Arrays;
class Array
{
    public static void repeat(int [] a)
    {
        for(int i=0;i<a.length;i++)
        {
            int count=1;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    count++;
                    System.out.println("First repeated element is "+a[i]+" with count "+count);
                    break;
                }
            }
            if(count>1)
            {
                break;
            }
        }
       
    }
    public static void main(String [] args)
    {
        int [] a={1,2,3,1,2};
        repeat(a);
    }
}