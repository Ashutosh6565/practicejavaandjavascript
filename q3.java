import java.util.Scanner;

public class q3 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int m = 0;
        while(n>0){
            int digits = n % 10;
            m = m*10 + digits;
            n = n/ 10;
        }
        System.out.println("The reversed number is " + m);
    }
}
