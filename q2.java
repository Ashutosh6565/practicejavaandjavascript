import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        if(n>0){
            while(n > 0){
                int digit = n % 10;
                sum += digit;
                n = n/ 10;
            }
            System.out.println("The sum of digits is " + sum);
        }
    }
}
