public class HarshadNumber {
    public static void main(String[] args) {
        int number = 18;
        int temp = number;
        int sum = 0;

        // Calculate sum of digits
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            temp /= 10;
        }

        // Check if number is divisible by sum of digits
        if (number % sum == 0) {
            System.out.println("harshad number");
        } else {
            System.out.println("not harshad number");
        }
    }
}