package questions;

public class fibtonthterm {
    public static void fab(int n){
        int a = 0;
        int b = 1;
        System.out.println(a + " " + b);
        for(int i = 2;i<=n;i++){
            int next = a + b;
            System.out.println(" " + next);
            a = b;
            b = next;
        }
    }
    public static void main(String[] args) {
        int n = 7;
        fab(n);
    }
}
