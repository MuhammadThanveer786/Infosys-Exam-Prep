import java.util.*;
class MaximumSumSubarray
{
    public static void main(String args[])
    {
        int arr[] = {2, 3, -8, 7, -1, 2, 3};
        int n = arr.length;
        int cs = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            cs = cs + arr[i];
            maxSum = Math.max(cs,maxSum);
            if(cs < 0)
            {
                cs = 0;
            }
        }
        System.out.println(maxSum);
        System.out.println(find(arr));
    }

    static int find(int[] arr)
    {
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            int cs = 0;

            for(int j=i;j<n;j++)
            {
                cs = cs + arr[j];
                maxSum = Math.max(cs,maxSum);
            }
        }
        return maxSum;
    }
}