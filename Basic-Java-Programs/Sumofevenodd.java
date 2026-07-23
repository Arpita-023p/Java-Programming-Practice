public class Sumofevenodd {
    public static void main(String[] args) {
        int n=10;
        int evensum=0;
        int oddsum=0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                evensum=evensum+i;
            }
            else{
                oddsum=oddsum+i;
            }
        }
        System.out.println("the sum of even number is "+evensum);
        System.out.println("the sum of odd number is "+oddsum);
    }
}
