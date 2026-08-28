class ValidPalindrome
{
    public static void main(String args[])
    {
        String str = "race a car";
        if(isValidPalindrome(str))
        {
            System.out.println("True, it is a palindrome string...!!");
        }
        else
        {
            System.out.println("False, not a palindrome String...!!");
        }
    }

    static boolean isValidPalindrome(String str)
    {
        int i = 0 ;
        int j = str.length() - 1;
        while(i<j)
        {
            char left = str.charAt(i);
            char right = str.charAt(j);
            
            if(!Character.isLetterOrDigit(left))
            {
                i++;
                continue;
            }

            if(!Character.isLetterOrDigit(right))
            {
                j--;
                continue;
            }

            if(Character.isLowerCase(left) != Character.isUpperCase(right))
            {
                return false;
            }
            
            i++;
            j--;
        }
        return true;
    }
}