public class SecondLargest {

    public static int findSecondLargestDigit(int number) {
        int largest = -1;
        int secondLargest = -1;
       // prepare a Logic to findout second largest digit of the number
       while(number!=0)
       {
           int rem=number%10;
           // number=number/10;

           if(largest<rem)
           {
               secondLargest=largest;
               largest=rem;
           }
           else if(rem<largest && rem>secondLargest)
           {
               secondLargest=rem;
           }
           number=number/10;

      }
      return secondLargest;
    }
        


    public static void main(String[] args) {
        int number = 123456;
        int secondLargest = findSecondLargestDigit(number);
        System.out.println("Second largest digit: " + secondLargest);
    }
}
