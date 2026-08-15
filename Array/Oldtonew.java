import java.util.Arrays;

public class Oldtonew {
    public static void main(String[] args) {
        int []arr={10,20,40,50,60,80};
        int old=20;
        int newe=111;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==old)
                arr[i]=newe;
        }
        System.out.println(Arrays.toString(arr));
    }
}
