package questions;

public class autonumbers {
    public static void main(String[] args) {
     int n = 5;
     int r = n*n;
     int digit = r % 10;
     if(digit == n){
        System.out.println("Automorphic number ");
     }else{
        System.out.println("not a  Automorphic number ");
     }

    }
}
