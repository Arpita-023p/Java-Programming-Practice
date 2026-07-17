public class Neon {
    public static void main(String[] args) {
        int num=9;
        int square=num*num;
        int sum=0;
        while(square>0){
            int rem=square%10;
            sum=sum+rem;
            square=square/10;
        }
        if(num==sum){
            System.out.println(num+" this number is a neon number");
        }
        else{
            System.out.println(num+" this number is not a neon number");
        }
    }
}
