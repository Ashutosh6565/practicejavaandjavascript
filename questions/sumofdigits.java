package questions;

public class sumofdigits {
    public static void sum(int n ){
        // int tem = n;
        int sum  = 0;
        while(n > 0){
            int temp = n % 10;
            sum += temp;
            n  = n/10;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int n =123;
        sum(n);
    }
}
