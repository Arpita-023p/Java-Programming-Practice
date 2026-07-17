public class Spy {
    public static void main(String[] args) {
        int num=123;
        int originalnumber=num;
        int sum=0;
        int product=1;
        while(num>0){
            int rem=num%10;
            sum=sum+rem;
            product=product*rem;
            num=num/10;
        }
        if(product==sum){
           System.out.println(originalnumber+" this number is a spy number"); 
        }
        else{
            System.out.println(originalnumber+" this number is not a spy number");
        }
    }
}
