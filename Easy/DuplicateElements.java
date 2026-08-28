import java.util.*;

class DuplicateElements
{
    public static void main(String args[])
    {
        int arr[] = {4, 3, 2, 7, 8, 2, 3, 1};

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : arr)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }

        ArrayList<Integer> list = new ArrayList<>();

        for(int key : map.keySet())
        {
            if(map.get(key) > 1)
            {
                list.add(key);
            }
        }

        System.out.println(list);
    }
}