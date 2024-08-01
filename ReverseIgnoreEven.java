public class ReverseIgnoreEven {

    public static int reverseIgnoringEvenDigits(int number) 
    {
        int reversed = 0;
        // Fill Out the Logic Here to print reversed number by ignoring even digits in a number
      // Example 1432 
      // print 31 as an Output by ignoring Even Digits and Reversing it

        while (number!=0) 
        {
            int rem=number%10;
            
            if (!(rem%2==0))
            {
                reversed=reversed*10+rem;
            }

            number/=10;


        }

      return reversed;
    }

    public static void main(String[] args)
     {
        int number = 123456;
        int result = reverseIgnoringEvenDigits(number);
        System.out.println("Reversed number excluding even digits: " + result);
    }
}
