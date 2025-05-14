import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int original = num;
        int result = 0;
        int temp = num;
        int digits = 0;
        while(temp != 0){
            temp /= 10;
            digits++;
        }
       while(num != 0){
        int digit = num % 10;
        result += Math.pow(digit, digits);
        num /= 10;
       }

       if(result == original){
        System.out.println("This is  the Armstrong number");
       }else{
        System.out.println("this is not a Aramstrong number");
       }
      
    }
}
