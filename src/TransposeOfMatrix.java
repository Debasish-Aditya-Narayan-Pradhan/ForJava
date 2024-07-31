import java.util.*;

public class TransposeOfMatrix {
    static void display(int[][] arr,int r,int c)
    {
        System.out.println("Matrix: ");
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
     static int[][] transpose(int[][] arr,int r,int c)
     {
         int[][] trs = new int[c][r];

         for(int i = 0; i < c; i++)
         {
             for(int j = 0; j < r; j++)
             {
                 trs[i][j] = arr[j][i];
             }
         }

         return trs;
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2][3];

        int r = 2;
        int c = 3;

        int[][] trs = new int[c][r];
        System.out.println("Enter "+(r*c)+" elements in the matrix: ");
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Before transpose: ");
        display(arr,r,c);
        trs = transpose(arr,r,c);
        System.out.println("After transpose: ");
        display(trs,c,r);
    }
}
