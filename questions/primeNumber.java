package questions;

public class primeNumber {

    public static void prime(int n) {
        if (n == 0 || n == 1) {
            System.out.println("the number is not a prime number ");
            return;
        }
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count += 1;
            }

        }
        if (count < 2) {
            System.out.println("number is  a prime ");
        } else {
            System.out.println("number is not prime number");
        }

    }

    public static void main(String[] args) {
        int n = 4;
        prime(n);
    }
}
