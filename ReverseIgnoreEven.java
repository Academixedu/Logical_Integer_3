public class ReverseIgnoreEven {

    public static int reverseIgnoringEvenDigits(int number) {
        int reversed = 0;
        // Fill Out the Logic Here to print reversed number by ignoring even digits in a number
      // Example 1432 
      // print 31 as an Output by ignoring Even Digits and Reversing it
      String strNum = Integer.toString(number);
        for (int i = strNum.length() - 1; i >= 0; i--) {
            char digit = strNum.charAt(i);
            if ((digit - '0') % 2 != 0) {
                reversed = reversed * 10 + (digit - '0');
            }
        }
      return reversed;
    }

    public static void main(String[] args) {
        int number = 123456;
        int result = reverseIgnoringEvenDigits(number);
        System.out.println("Reversed number excluding even digits: " + result);
    }
}
