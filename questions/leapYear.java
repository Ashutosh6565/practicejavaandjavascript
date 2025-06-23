package questions;

public class leapYear {
    public static void leap(int n ){
        if(n % 400 == 0){
            System.out.println("it is a leap year");
        }else if((n % 4 == 0 ) && (n%100 != 0)){
            System.out.println("leap year");
        }else{
            System.out.println("it is not a leap year");
        }
    }
    public static void main(String[] args) {
        int n = 2019;
        leap(n);
    }
}
