package pattern;

public class q9 {
    public static void main(String[] args) {
        int i;
        int j;
        int n  = 4;
        for( i = 0;i<n;i++){
           if(i == 0 || i == n-1){
            for(j = 0;j<n;j++ ){
            System.out.print("*");
            }
           }else{
            for(j = 0;j<n;j++){
                if(j == 0 || j== n-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
           }
           System.out.println();
        }

        
    }
}
