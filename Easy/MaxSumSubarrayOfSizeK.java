import java.util.*;
class MaxSumSubarrayOfSizek
{
    public static void main(String args[])
    {
        int arr[] = {100,200,300,400};
        int k = 2;

        System.out.println(Maximum(arr,k));
    }

    static int Maximum(int arr[] , int k)
    {
        int n = arr.length;
        int sum = 0;
        int max = 0;
        for(int i=0;i<k;i++)
        {
            sum = sum + arr[i];
        }

        max = Math.max(sum,max);

        for(int i=k;i<n;i++)
        {
            sum = sum + arr[i];
            sum = sum - arr[i-k];
            max = Math.max(sum,max);
        }

        return max;
    }
}