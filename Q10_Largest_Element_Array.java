/**
 * Q10_Largest_Element_Array
 */
public class Q10_Largest_Element_Array 
{
    public static void main(String[] args)
     {
        // int array[]=new int[10]; // or 
        // int array[]={1,2,3,4,4,5,6,7,10,23,27,45}; // or 
        int[] Num=new int[]{1000,2,3,4,4,5,800,7,10,23,27,2000};
        int largeNum=0;
        // System.out.println(Num.length);
        for(int i=1;i<=Num.length;++i)
        {
            
            
                if(Num[i-1]>largeNum)
                {
                    largeNum=Num[i-1];
                    
                }
                          

        }
        System.out.println( "The largest Number is "+largeNum);
       
    }
    
}