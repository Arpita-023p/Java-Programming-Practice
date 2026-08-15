import java.util.Arrays;

public class Lastoccurance {
    public static void main(String[] args) {
        int []arr={10,20,54,34,89,20};
        int old=20;
        int newe=111;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==old)
                {
               arr[i]=newe;
               break;
            }
               
        }
        System.out.println(Arrays.toString(arr));

    }
}
