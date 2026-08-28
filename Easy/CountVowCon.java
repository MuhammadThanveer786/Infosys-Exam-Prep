class CountVowCon
{
    public static void main(String args[])
    {
        String str = "Muhammad Thanveer Akula";
       countVC(str);
    }

    static void countVC(String str)
    {
        int n = str.length();
        int v = 0;
        int c = 0;
        
        String s = str.toLowerCase();

        for(int i=0;i<n;i++)
        {
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                v++;
            }
            else
            {
                c++;
            }
        }

        System.out.println("the number of vowels are : "+v);
        System.out.println("the number of consonents are : "+c);

    }
}