package questions;

public class lcmmm {
    
    public static void  mmm (int n, int m){
        int lcmm = 0;
        int max = n>m ? n : m;
        System.out.println(max);
        for(int i = max;i<n*m;i++){
            if(i%m == 0 && i%n == 0){
                lcmm = i;
                break;
            }
        }
        System.out.println(lcmm);
    }
    public static void main(String[] args) {
        int n = 18;
        int m =12;
        mmm(n, m);
    }
}
