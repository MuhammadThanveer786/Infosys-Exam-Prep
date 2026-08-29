import java.util.*;
class IntersectionOfArrays
{
    public static void main(String args[])
    {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {2,3,6,7,8,4};

        intersection(arr1,arr2);
    }

    static void intersection(int arr1[], int arr2[])
    {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int num : arr1)
        {
            set.add(num);
        }

        for(int num : arr2)
        {
            if(set.contains(num))
            {
                list.add(num);
                set.remove(num);
            }
        }

        System.out.println(list);
    }
}