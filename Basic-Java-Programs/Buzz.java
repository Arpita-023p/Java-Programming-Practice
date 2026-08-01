public class Buzz {
    public static void main(String[] args) {
        int number=49;
        int rem;
        int digit;
         rem=number%10;
         digit=number/7;
        if(digit==0||rem==7){
         System.out.println("buzz");
        }
        else{
        System.out.println("not buzz");
        }
    }
}
