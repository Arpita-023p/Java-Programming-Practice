class Duck{
    public static void main(String[] args){
        int n=2014;
        int orginalnum=n;
        boolean isduck=false;
        while(n>0){
            int rem=n%10;
            if(rem==0){
                isduck=true;
                break;
            }
            n=n/10;
        }
        if(isduck){
          System.out.println(orginalnum+" num is a duck number");
        }
        else{
             System.out.println(orginalnum+" num is not a duck number");
        }
    }
}