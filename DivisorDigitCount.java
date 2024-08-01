public class DivisorDigitCount {

    public static int countDivisorDigits(int number) {
        int count = 0;
        int temp = number;
        while(number!=0)
        {
            int rem=number%10;
            if(temp%rem==0){
                count++;
            }
            number=number/10;
        }
        // Problem: Write a Logic to count the number of digits in a number that are also divisors of the number.
        // Example: For the number 128, the digits 1, 2, and 8 are all divisors of 128. The count should be 3.
      // if we take 28 only 2 is the factor of the digits hence it should return count as 1
        return count;
    }

    public static void main(String[] args) {
        int number = 28;
        int count = countDivisorDigits(number);
        System.out.println("Count of divisor digits: " + count);
    }
}
