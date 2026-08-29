class ArraySorted
{
    public static void main(String args[])
    {
        int arr[] = {1,2,3,4,5,6,7};
        boolean checking = check(arr);
        System.out.println(checking);
    }

    static boolean check(int arr[])
    {
        int n = arr.length;
        for(int i=1;i<n;i++)
        {
            if(arr[i] < arr[i-1])
            {
                 return false;
            }
        }
        return true;
    }
    
}