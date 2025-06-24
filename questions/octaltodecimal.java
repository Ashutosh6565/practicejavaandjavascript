package questions;

public class octaltodecimal {
    public static void octal(int n){
        int count = 0;
        int sum = 0;
        while(n > 0){
            int temp = n % 10;
            sum += temp*Math.pow(8, count);
            n /= 10;
            count++;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int n = 2001;
        octal(n);
    }
}
