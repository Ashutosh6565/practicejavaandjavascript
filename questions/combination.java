package questions;

public class combination {
    static int fact(int n){
        int fact = 1;
        for(int i = 1;i<=n;i++){
            fact *= i;
        }
        return fact;
    }
    public static void perm(int n, int r){
      int fact1 = fact(n);
      int fact2 = fact(r);
      int fact3 = fact(n-r);
       

        int result = fact1 / (fact2 * fact3);
        System.out.println(result);
    }
    public static void main(String[] args) {
        int m  =5;
        int n = 2;
        perm(m, n);
    }
}
