public class Happynumber {
    public static void main(String[] args){
        int number = 19;
        int result = number;
        while (result != 1 && result != 4) {
            int sum = 0;
            int temp = result;
            while (temp > 0) {
                int digit = temp % 10;
                sum += digit * digit;
                temp /= 10;
            }

            result = sum; 
        }

        if (result == 1) {
            System.out.println(number +" happy number");
        } else {
            System.out.println(number +" not happy number");
        }
    }
}
