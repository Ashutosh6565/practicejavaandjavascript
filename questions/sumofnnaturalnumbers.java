package questions;

public class sumofnnaturalnumbers {
     static void summ(int n){
        int sum = 0;
        for(int i = 1;i<=n;i++){
            sum += i;
        }
        System.out.println(sum);
     }
    public static void main(String[] args) {
        int n  =5;
        summ(n);
    }
}
