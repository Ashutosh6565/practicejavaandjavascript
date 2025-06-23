package questions;

public class primenumbersinrange {
    public static void prime( int s, int end){
                if(s == 0 || s == 1){
                    // System.out.println("number is not a prime ");
                    
                }
        int count = 0;
        for(int i = s;i<=end;i++){
            for(int j = 1;j<=end/2;j++){
                if(i % j == 0){
                    count++;
                    
                }
            }
            if(count < 2){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
       int s =2;
       int e = 10;
       prime(s, e);

    }
}
