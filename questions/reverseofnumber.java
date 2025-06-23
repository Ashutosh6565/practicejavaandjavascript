package questions;

public class reverseofnumber {
    static void reverse(int n ){
        int num = 0;
        while(n > 0){
            int temp = n % 10;
            num = num *10 + temp;
            n = n/10;
        }
        System.out.println(num);
    }
    public static void main(String[] args) {
     int n = 123;
     reverse(n);   
    }
}
