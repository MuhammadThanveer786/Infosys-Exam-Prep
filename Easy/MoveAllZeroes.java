import java.util.*;
class MoveAllZeroes
{
    public static void main(String args[])
    {
        int arr[] = {1,0,2,0,0,3};

        int n = arr.length;

        int res[] = new int[n];

        int x = 0;
        for(int i=0;i<n;i++)
        {
            if(arr[i] != 0)
            {
                res[x] = arr[i];
                x++;
            }
        }
        System.out.println(Arrays.toString(res));



        //optimal() 
        int result[] = optimal(arr);

        System.out.println(Arrays.toString(result));
        
    }

    static int[] optimal(int arr[])
    {
        int n = arr.length;

        int j = 0;

        for(int i=0;i<n;i++)
        {
            if(arr[i] != 0)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        return arr;
    }
}