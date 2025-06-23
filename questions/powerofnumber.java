package questions;

public class powerofnumber {
    public static void main(String[] args) {
        int n = 9;
        int p = 3;
        int m = 1;
        for(int i = 1;i<=p;i++){
            m *= n;
        }
        System.out.println(m);
    }
}
