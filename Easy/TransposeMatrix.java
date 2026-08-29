
import java.util.*;
class TransposeMatrix
{
    public static void main(String args[])
    {
       int mat[][] = {{1, 1, 1, 1}, {2, 2, 2, 2}, {3, 3, 3, 3}, {4, 4, 4, 4}};

       System.out.println(Arrays.deepToString(transpose(mat)));

    }

    static int[][] transpose(int mat[][])
    {
        int row = mat.length;
        int col = mat[0].length;

        int result[][] = new int[col][row];

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                result[j][i] = mat[i][j];
            }
        }

    return result;

    }
}