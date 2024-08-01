public class SecondLargest {

    public static int findSecondLargestDigit(int number) {
        int largest = 0;
        int secondLargest = 0;
       // prepare a Logic to findout second largest digit of the number
       while(number!=0){
//123
       
       int digit=number%10;//3 2
       number=number/10;
       if (digit > largest) {
        secondLargest = largest; // Update second largest//-1
        largest = digit; // Update largest 3
    } 
    else if (digit > secondLargest && digit < largest) {
        secondLargest = digit; // Update second largest
    }
}
    
        return secondLargest;
    
    }
    public static void main(String[] args) {
        int number = 123456;
        int secondLargest = findSecondLargestDigit(number);
        System.out.println("Second largest digit: " + secondLargest);
    }
}
