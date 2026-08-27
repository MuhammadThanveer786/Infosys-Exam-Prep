/*Problem Statement
Given an array of N distinct integers, find the second largest element without sorting the entire array.
Constraints
2 <= N <= 10^5, -10^9 <= arr[i] <= 10^9
Example
Input: [12, 35, 1, 10, 34, 1]
Output: 34
Explanation: 35 is the largest, 34 is the second largest.
*/


public class SecondLargestElement
{
    public static void main(String args[])
    {
        int arr[] = {7,7,7,7,7,7};
        int res = secondLargest(arr);
        System.out.println(res);
        
    }


    static int secondLargest(int arr[])
    {
        int n = arr.length;
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int i=0;i<n;i++)
        {
            if(arr[i] >= largest)
            {
                largest = arr[i];
            }
        }
        
        for(int i=0;i<n;i++)
        {
            if(arr[i] >= second && arr[i] != largest)
            {
                second = arr[i];
            }
        }

        if(second == Integer.MIN_VALUE)
        {
            return -1;
        }

        return second;
    }
}