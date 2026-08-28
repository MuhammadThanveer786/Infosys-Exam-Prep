class ValidAnagrams
{
    public static void main(String args[])
    {
        String s1 = "listen";
        String s2 = "silent";
        if(isAnagram(s1,s2))
        {
            System.out.println("Yes it is Valid Anagram");
        }
        else
        {
            System.out.println("Not a valid Anagram");
        }
    }

    static boolean isAnagram(String s1,String s2)
    {
        if(s1.length() != s2.length())
        {
            return false;
        }   

        int freq[] = new int[26];

        for(int i=0;i<s1.length();i++)
        {
            char ch = s1.charAt(i);
            char ch1 = s2.charAt(i);

            freq[ch - 'a']++;
            freq[ch1 - 'a']--;
        }

        for(int num : freq)
        {
            if(num != 0)
            {
                return false;
            }
        }

        return true;
    }
}