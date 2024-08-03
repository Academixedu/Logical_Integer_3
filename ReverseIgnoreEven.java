public class ReverseIgnoreEven {
    public static int reverseIgnoringEvenDigits(int number) {
        int reversed = 0;
        // Fill Out the Logic Here to print reversed number by ignoring even digits in a number
      // Example 1432 
      // print 31 as an Output by ignoring Even Digits and Reversing it
      while(number>0){
        int dig = number%10;//5
        if(dig%2!=0){
            reversed=reversed*10+dig;

        }
        number=number/10;
      }

      return reversed;
    }
