public class Maxmin {
    public static void main(String[] args) {
        int[] arr={10,80,45,67,23};
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i])
                max=arr[i];
        }
        System.out.println("the max element is "+max);

        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(min>arr[i])
                min=arr[i];
        }
        System.out.println("the min element is "+min);
    }
}
