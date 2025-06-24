package questions;

public class permutation {
    public static void perm(int n, int r){
        int fact1 = 1;
        for(int i = 1;i<=n;i++){
            fact1 *= i;
        }
        int fact2 = 1;
        int number = n-r;
        for(int i = 1;i<=number;i++){
            fact2 *= i;
        }

        int result = fact1 / fact2;
        System.out.println(result);
    }
    public static void main(String[] args) {
        int n = 5;
        int m = 9;
        perm(n, m);
    }
}
