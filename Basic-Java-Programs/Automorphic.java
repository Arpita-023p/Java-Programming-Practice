public class Automorphic {
    public static void main(String[] args) {
        int num=625;
        int count=0;
        int originalnumber=num;
        int square=num*num;
        while(num>0){
         num=num/10;
         count++;
        }
       int lastdigit=square%(int) Math.pow(10,count);
       if(lastdigit==originalnumber){
        System.out.println(originalnumber+" this number is a automorphic number");
     }
     else{
        System.out.println(originalnumber+" this number is not a automorphic number");
     }
    }
}
