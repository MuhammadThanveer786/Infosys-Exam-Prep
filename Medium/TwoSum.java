import java.util.*;

class TwoSum
{
    public static void main(String args[])
    {
        int arr[] = {3, 2, 4, 8};
        int target = 6;

        int res[] = optimal(arr,target);
        System.out.println(Arrays.toString(res));
       
    }
    static int[] brute(int arr[],int target)
    {
         int n = arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;i<n;i++)
            {
                if(arr[i] + arr[j] == target)
                {
                    return new int[]{i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }
    
    static int[] optimal(int arr[],int target)
    {
        int n = arr.length;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<n;i++)
        {
            int needed = target - arr[i];

            if(map.containsKey(needed))
            {
                return new int[]{map.get(needed),i};
            }
            map.put(arr[i],i);
        }

        return new int[]{-1,-1};
    }
}