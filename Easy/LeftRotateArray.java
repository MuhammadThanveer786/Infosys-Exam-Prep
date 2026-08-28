import java.util.*;
class LeftRotateArray
{
    public static void main(String args[])
    {
        int arr[] = {1,2,3,4,5};
        int d = 4;
        rotate(arr,d);
    }
    static void rotate(int arr[], int d)
    {
        int n = arr.length;
        d = d % n;

        int temp[] = new int[n];
        int x = 0;
        for(int i=d;i<n;i++)
        {
            temp[x] = arr[i];
            x++;
        }
        for(int i=0;i<d;i++)
        {
            temp[x] = arr[i];
            x++;
        }

        for(int i=0;i<n;i++)
        {
            arr[i] = temp[i];
        }

        System.out.println(Arrays.toString(arr));
    }



    
}