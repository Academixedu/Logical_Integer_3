public class DivisorDigitCount {

    public static int countDivisorDigits(int number) {
        int count = 0;
        int temp = number;
      while (number > 0) {
        int digit= number % 10;
        if (digit!=0 && temp%digit==0) {
          count++;     
        }
        number/=10;
    }
        return count;
    }    

    public static void main(String[] args) {
        int number = 128;
        int count = countDivisorDigits(number);
        System.out.println("Count of divisor digits: " + count);
    }
}
