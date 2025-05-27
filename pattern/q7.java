package pattern;

public class q7 {
    public static void main(String[] args) {
        int n = 5;
        int space = n-1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            space--;
            System.out.println();
        }
        space = 1;
        for(int i = n;i>1;i--){
                for(int j = 1;j<space;j++){
                        System.out.print(" ");
                }
                for(int k = 1;k<i;k++){
                    System.out.print("* ");
                }
                System.out.println();
                space++;
        }
    }
}
