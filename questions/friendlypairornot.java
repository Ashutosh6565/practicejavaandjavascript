package questions;

public class friendlypairornot {
    public static int div(int n ){
        int sum = 0;
        // int temp = n;
        for(int i = 1;i<=n;i++){
            if(n % i == 0){
                sum += i;
            }
        }
        System.out.println(sum);
        return sum/n;
    }
    public static void main(String[] args) {
        int n = 30;
        int m = 140;
        int re = div(n);
        int re2 = div(m);
        if(re == re2){
            System.out.println("Friendly pair ");
        }else{
            System.out.println("Not a Friendly pair");
        }
    }
}
