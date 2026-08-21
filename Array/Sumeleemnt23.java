public class Sumeleemnt23 {
    public static void main(String[] args) {
      int arr[]={12, 5, 18, 7, 9, 24, 10, 6};
      int sum=0;
      for(int i=0;i<arr.length;i++){
        if(arr[i]%2==0 && arr[i]%3==0){
            sum=sum+arr[i];
        }
      }
      System.out.println("the sum of element which are divisible by 2 and 3 is "+sum);
    }
}
