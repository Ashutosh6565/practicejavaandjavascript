package questions;

public class palindromnumbers {
    public static void palindrom(int n ){
        int re= 0;
        int temp = n;
        while(n > 0){
            int t = n % 10;
            re = re * 10 + t;
            n = n / 10;

        }
        if(re == temp){
            System.out.println(" it is a palindrom number");
        }else{
            System.out.println("this is not a palindrom number");
        }
    }
    public static void main(String[] args) {
        int n =  3231;
        palindrom(n);
    }
}
