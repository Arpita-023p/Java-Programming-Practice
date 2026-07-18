public class Sunny {
    public static void main(String[] args) {
        int num=8;
        int nextnumber=num+1;
        int squareroot=(int)Math.sqrt(nextnumber);
        System.out.println(squareroot);
        System.out.println(nextnumber);
        if(squareroot*squareroot==nextnumber){
            System.out.println(num+" this number is a sunny number");
        }
        else{
             System.out.println(num+" this number is a not sunny number");
        }
    }
}
