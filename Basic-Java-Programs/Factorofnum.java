public class Factorofnum {
    public static void main(String[] args) {
        int num=12;
        System.out.println("Factors of number "+num+" are");
        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.println(i+" ");
            }
        }
    }
}
