package questions;

public class abundantNumber {
    public static void main(String[] args) {
        int n  = 15;
        int temp  = n;
        int sum = 0;

        for(int i = 1;i<n;i++){
            if(temp % i == 0){
                sum += i;
            }
        }
        if(sum > n){
            System.out.println("Abundant Numbe");
        }else{
            System.out.println("not a Abundant Number ");
        }
    }
}
