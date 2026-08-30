class MaximumSubArraySum
{
    public static void main(String args[])
    {
        int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for(int i=0;i<n;i++)
        {
            currentSum = currentSum + arr[i];
            maxSum = Math.max(currentSum,maxSum);
            if(currentSum < 0)
            {
                currentSum = 0;
            }
        }

        System.out.println(maxSum);
    }
}