package questions;

public class hcf {
    public static void hcff(int m,int n){
        // int l = Math.min(m, n);
        int hcf = 0;
        for(int i = 1;i<=m || i<=n;i++){
            if(m % i == 0 && n % i == 0){
                hcf = i;
                
            }
        }
        System.out.println(hcf);
    }
    public static void main(String[] args) {
        int m = 12;
        int n = 18;
        hcff(m, n);
    }
}
