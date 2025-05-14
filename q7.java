import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println("It is the leap year");
        }else{
            System.out.println("This is not a leap year.");
        }
    }
}
