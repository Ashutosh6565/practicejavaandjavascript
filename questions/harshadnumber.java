package questions;

public class harshadnumber {
    public static void main(String[] args) {
        int n  = 25;
        int temp = n;
        int sum  = 0;
        while(temp > 0){
            int d = temp % 10;
            sum += d;
            temp /= 10;
        }
        if(n % sum == 0){
            System.out.println("harshad number");
        }else{
            System.out.println("no a harshad number");
        }
    }
}
