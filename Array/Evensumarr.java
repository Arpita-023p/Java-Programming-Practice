public class Evensumarr {
    public static void main(String[] args) {
        int arr[]={23,48,12,73,90};
             int evensum=0;
        for(int i=0;i<arr.length;i++){
           if(arr[i]%2==0){
         evensum+=arr[i];
            }     
        }
        System.out.println("the sum of even number is "+evensum);
    }
}
