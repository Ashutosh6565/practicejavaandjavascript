package questions;

public class fibonacceseries {
    public static int fibo(int n ){
        int a  = 0;
        int b = 1;
        for(int i = 2;i<=n;i++){
            int temp = b;
            
            b = b + a;
            a = temp;
        }
        return b;

    }
    public static void main(String[] args) {
        int n = 7;
        System.out.println(fibo(n));
    }
}
