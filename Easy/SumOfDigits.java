// Sum of Digits Until a Single Digit Remains (Digital Root)

class SumOfDigits
{
    public static void main(String args[])
    {
        int n = 12345;
        int res = sum(n);

      while(count(res)>1)
      {
        res = sum(res);
      }

      System.out.println(res);
    }

    static int count(int n)
    {
        int count = 0;
        while(n>0)
        {
            count++;
            n=n/10;
        }
        return count;
    }



    static int sum(int n)
    {
        int sum = 0;
        while(n > 0)
        {
            int rem = n % 10;
            sum = sum + rem;
            n = n/10;
        }
        return sum;
    }

}