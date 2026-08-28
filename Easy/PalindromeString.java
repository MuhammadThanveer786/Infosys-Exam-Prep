class PalindromeString
{
    public static void main(String args[])
    {
        String str = "hello";

        if(isPalindrome(str))
        {
            System.out.println("yes it is palindrome");
        }
        else
        {
            System.out.println("Not a palindrome number");
        }
    }

    static boolean isPalindrome(String str)
    {
        char ch[] = str.toCharArray();
        int i = 0;
        int j = ch.length - 1;

        while(i<j)
        {
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }

        String rev = new String(ch);

        return str.equals(rev);
    }
}