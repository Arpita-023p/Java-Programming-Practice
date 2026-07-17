public class Armstrong {
    public static void main(String[] args) {
        int n=153;
        int originalnumber=n;
        int sum=0;
        while(n>0){
            int rem=n%10;
            int cube=rem*rem*rem;
            sum=sum+cube;
            n=n/10;
        }
        if(originalnumber==sum){
            System.out.println(originalnumber+" This number is armstrong number");
        }
        else{
            System.out.println(originalnumber+" This number is not a armstrong number");
        }
    }
}
