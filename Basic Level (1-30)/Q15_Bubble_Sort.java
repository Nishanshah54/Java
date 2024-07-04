/**
 * Q15_Bubble Sort
 */
public class Q15_Bubble_Sort 
{
   
      public static void display(int[] a)
      {
        for(int i=0;i<a.length;i++)
        {
            System.out.println("\t"+a[i]);
            // System.out.println(i); 
        }
      }
      public static void Bubble_Sort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) 
    {
        int[] array={23,234,5,3,25,65,643};
        System.out.println("Before sort");
        display(array);     
        System.out.println("After sort");
        Bubble_Sort(array);   
        display(array);     
    }
    
}