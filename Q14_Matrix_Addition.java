/**
 * Q14_Matrix_Addition
 */
public class Q14_Matrix_Addition {
     public static int[][] Matrix_Addition(int[][] matrix,int[][] matrix1 )
    {
        
        int[][] addMatrix=new int[2][2];
        for(int i=0;i<2;i++)
        {
            for(int a=0;a<2;a++)
            {
              
                    addMatrix[i][a]=matrix[i][a]+matrix1[i][a];            
            }
            System.out.println("\t");
        } 
        return addMatrix;

    }

    public static void Display(int[][] matrix )
    {
        for(int i=0;i<2;i++)
        {
            for(int a=0;a<2;a++)
            {
                System.out.print( "\t" +matrix[i][a]);
            }
            System.out.println("\t");
        }
    }
    public static void main(String[] args)
    {
        //creating 2D matrix
        int[][] matrix={{1,2},{3,4}};
        System.out.println("Matrix First:");
        Display(matrix);     
        System.out.println("Matrix Second");
        int matrix_2[][]={{5,6},{7,8}};
        Display(matrix_2); 
    //    Display( Matrix_Addition(matrix,matrix_2)); //direct methord 
        int add[][]=Matrix_Addition(matrix,matrix_2); //for easy understanding 
        System.out.println("Addition of Matrix");
        Display(add);
    }
}