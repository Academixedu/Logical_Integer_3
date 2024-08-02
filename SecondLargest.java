public class SecondLargest {

    public static int findSecondLargestDigit(int number) {
        int largest = -1;
        int secondLargest = -1;
       // prepare a Logic to findout second largest digit of the number
       while(number!=0){ //123456
        int rem=number%10; //6,5,4,3,2,1
        if(rem>largest){
            
            secondLargest=largest; // -1
            largest=rem; //6
        }
        else if(rem>secondLargest && rem<largest){
                secondLargest=rem; //5
        }
        number /=10;
       }
        return secondLargest;
    }

    public static void main(String[] args) {
        int number = 123456;
        int secondLargest = findSecondLargestDigit(number);
        System.out.println("Second largest digit: " + secondLargest);
    }
}
