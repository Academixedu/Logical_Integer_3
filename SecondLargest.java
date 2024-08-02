public class SecondLargest {

    public static int findSecondLargestDigit(int number) {
        int largest = -1;
        int secondLargest = -1;
       // prepare a Logic to findout second largest digit of the number
       while(number>0){
        int b=number%10;
        number=number/10;
        if(b>largest){
            secondLargest=largest;
            largest=b;
        }
        else if(b>secondLargest && b!=largest){
            secondLargest=b;
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
