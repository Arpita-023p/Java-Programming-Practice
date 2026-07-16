public class Pallindrome {
    public static void main(String[] args) {
        int n=121;
        int originalnum=n;
        int rev=0;
        while(n>0){
            int rem=n%10;
            rev=(rev*10)+rem;
            n=n/10;
        }
        System.out.println(rev);
        if(rev==originalnum){ 
            System.out.println(originalnum +" This number is pallindrome");
        }
        else{
               System.out.println(originalnum +" This number is not pallindrome");
        }
    }
}
