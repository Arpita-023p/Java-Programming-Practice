public class Factorialsumarr {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5};
        int totalSum = 0;

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int fact = 1;

            for (int j = 1; j <= num; j++) {
                fact *= j;
            }
            totalSum += fact;
        }

        System.out.println("Sum of factorials: " + totalSum);
    }
    }

