    package pattern;

    public class q3 {
    public static void main(String [] arg){
        int n = 5;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(" ");
            }
            for(int k = 1;k<=n-i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    }
