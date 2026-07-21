public class Sumofnatural {
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("sum of first " + n + " natural number is: " + sum);
    }
}
