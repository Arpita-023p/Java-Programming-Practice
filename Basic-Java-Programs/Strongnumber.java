public class Strongnumber {
    public static void main(String[] args) {
        int n=145;
          int originalnumber=n;
        int sum=0;
        while(n>0){
            int rem=n%10;
            int fact=1;
            for(int i=1;i<=rem;i++){
                fact=fact*i;
            }
            sum=sum+fact;
            n=n/10;
        }
        if(originalnumber==sum){
            System.out.println(originalnumber+" this number is a strong number");
        }
        else{
              System.out.println(originalnumber+" this number is not a strong number");
        }
    }
}
