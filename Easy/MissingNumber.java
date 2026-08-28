class MissingNumber
{
    public static void main(String args[])
    {
        int arr[] = {1,2,3,5};
        int res = Missing1(arr);
        System.out.println(res);
    }

    static int Missing(int arr[])
    {
        int n = arr.length + 1;

        int expectedSum = n*(n+1)/2 ;

        int actualSum = 0;
        for(int i=0;i<arr.length;i++)
        {
            actualSum = actualSum + arr[i];
        }

        return expectedSum - actualSum;
    }

    static int Missing1(int arr[])
    {
        int n = arr.length + 1;
        
        int xor = 0;

        for(int i=1;i<=n;i++)
        {
            xor = xor ^ i;
        }

        for(int i=0;i<arr.length;i++)
        {
            xor = xor ^ arr[i];
        }

        return xor;
    }
}