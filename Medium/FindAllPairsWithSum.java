import java.util.*;
class FindAllPairsWithSum
{
    public static void main(String args[])
    {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int target = 7;

        int result[][] = find2(arr,target);

        System.out.println(Arrays.deepToString(result));


    }

    static int[][] find(int arr[],int target)
    {
        int n = arr.length;

        ArrayList<int[]> list = new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i] + arr[j] == target)
                {
                    list.add(new int[]{arr[i],arr[j]});
                }
            }
        }

        return list.toArray(new int[list.size()][]);
    
    }



    static int[][] find2(int arr[] , int target)
    {
        ArrayList<int[]> list = new ArrayList<>();

        int left = 0;
        int right = arr.length - 1;

        while(left < right)
        {
            int sum = arr[left] + arr[right] ;
            if(sum == target)
            {
                list.add(new int[]{arr[left],arr[right]});
                left++;
                right--;
            }
            else if(sum < target)
            {
                left++;
            }
            else 
            {
                right--;
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}