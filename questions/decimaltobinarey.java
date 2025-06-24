package questions;

public class decimaltobinarey {
    public static void binarey(int n){
        int count = 0;
        // int digit = 0;
        int sum = 0;
        while(n > 0){
            int temp = n % 10;
            sum += temp*Math.pow(2, count);
            n /= 10;
            // digit++;
            count++;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int n = 1010101;
        binarey(n);
    }

}
