import java.util.Scanner;

public class q1 {

    public static Boolean isPrime(int n){
            if (n<=1) return false;
            if(n == 2) return true;
            if(n % 2 == 0) return false;
            for (int i = 3; i <= Math.sqrt(n); i += 2) {
                if (n % i == 0) return false;
            }
            return true;
        }
    public static void main(String[] args) {
        // Your code goes here
        System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int count = 0;  
        System.out.println("The is prime number "+ isPrime(n));

    }
}