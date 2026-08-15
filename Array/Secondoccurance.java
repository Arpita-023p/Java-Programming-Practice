import java.util.Arrays;

public class Secondoccurance {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 54, 20, 89, 20 };
        int old = 20;
        int newe = 111;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == old) {
                count++;
                if (count == 2) {
                    arr[i] = newe;
                    break;
                }
            }
         }
             System.out.println(Arrays.toString(arr));
     }
}
