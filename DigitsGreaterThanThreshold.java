public static int countDigitsGreaterThan(int number, int threshold) {
        int count = 0;
        //prepare the Logic to find out count of numbers which is greater than threshold 
        while(number >0){
            int dig = number%10;
            if(dig>threshold){
                count++;
            }
            number/=10;

        }
      return count;
    }
