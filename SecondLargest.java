public class SecondLargest {

    public static int findSecondLargestDigit(int number) {
        int largest = -1;
        int secondLargest = -1;
       // prepare a Logic to findout second largest digit of the number
    
       while(number > 0){
        int digit = number % 10;
        if(digit > largest){
            secondLargest = largest;
            largest = digit;
        }
        else if (digit > secondLargest && digit != largest){
       }
       secondLargest = digit;
    }
    number =  number/10;

        return secondLargest;
    }

    public static void main(String[] args) {
        int number = 123456;
        int secondLargest = findSecondLargestDigit(number);
        System.out.println("Second largest digit: " + secondLargest);
    }
}
