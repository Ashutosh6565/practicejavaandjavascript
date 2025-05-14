import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int copey = n;
        int sum = 0;
        while(n > 0){
            
        int fact = 1;
            int digit = n %10;
            for(int i = 1;i<=digit;i++){
                fact *= i;
            }
            sum += fact;
            n = n / 10;

        }
        if(sum == copey){
            System.out.println("it is a strong number");
        }
        else{
            System.out.println("it is not a strong number");
        }
    }
}
