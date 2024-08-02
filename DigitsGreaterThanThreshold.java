public class DigitsGreaterThanThreshold {

    public static int countDigitsGreaterThan(int number, int threshold) 
    {
        int count = 0;

        //prepare the Logic to find out count of numbers which is greater than threshold 
        while(number!=0)
        {
           int  rem=number%10;
            if(rem>threshold)
            {
                count++;
            }
            number=number/10;


        }
      return count;
    }

    public static void main(String[] args) {
        int number = 895    ;
        int threshold = 3;
        int count = countDigitsGreaterThan(number, threshold);
        System.out.println("Count of digits greater than " + threshold + ": " + count);
    }
}
