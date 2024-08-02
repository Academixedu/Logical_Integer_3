import java.util.Scanner;

public class DigitsGreaterThanThreshold
 {

    public static int countDigitsGreaterThan(int number, int threshold) 
    {
        int count = 0;
        //prepare the Logic to find out count of numbers which is greater than threshold 
    
      Scanner in=new Scanner(System.in);
      System.out.println("Enter the value");
      int a=in.nextInt();
      while (a!=0)
       {
        
        int rem=a%10;
        if(rem>threshold)
        {
         count++;   
        }
     a=a/10; 
    }
   in.close();
    return count;

    }

    public static void main(String[] args) {
        int number = 123456;
        int threshold = 3;
        int count = countDigitsGreaterThan(number, threshold);
        System.out.println("Count of digits greater than " + threshold + ": " + count);
    }
}
