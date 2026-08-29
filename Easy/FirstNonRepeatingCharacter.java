import java.util.*;
class FirstNonRepeatingCharacter
{
    public static void main(String args[])
    {
        String str = "geeksforgeeks";
        char ch = find(str);
        System.out.println(ch);
    }

    static char find(String s)
    {
         HashMap<Character,Integer> map = new HashMap<>();
        
        for(char ch : s.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0) + 1);
        }
        
        for(char key : s.toCharArray())
        {
            if(map.get(key) == 1)
            {
                return key;
            }
        }
        
        return '$';
    }
}