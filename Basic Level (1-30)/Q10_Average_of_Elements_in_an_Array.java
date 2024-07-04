/**
 * Q10_Average_of_Elements_in_an_Array
 */
public class Q10_Average_of_Elements_in_an_Array 
{
    public static void main(String[] args) {
        
        int[] NumArray=new int[]{1,2,32,44,5,3,545,4,5};
        int sum=0;
        for(int i=0;i<NumArray.length;i++)
        {
            sum=NumArray[i]+sum;

        }

        int avg=sum/NumArray.length;
        System.out.println("The Average of Elements in an Array is : "+avg);
    }

    
}