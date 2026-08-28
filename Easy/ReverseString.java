class ReverseString
{
    public static void main(String args[])
    {
        String str = "Thanveer";
        String rev = reverse(str);
        System.out.println(rev);
    }

    static String reverse(String str)
    {
        

        char ch[] = str.toCharArray();

        int left = 0;
        int right = ch.length -1;

        while(left < right)
        {
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
    
     return new String(ch);
    }

    
}