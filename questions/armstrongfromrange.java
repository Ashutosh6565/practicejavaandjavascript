package questions;

public class armstrongfromrange {
    public static boolean armstrongnumbers(int n ){
        int temp = n;
        int digit = 0;
        int sum = 0;
        boolean res = false;
        while(temp > 0){
            temp /= 10;
            digit++;
        }

        int ne = n;
        while(ne > 0){
            int tem = ne % 10;
            double sq = Math.pow(tem, digit);
            sum +=  sq;
            ne /= 10;
        }
        if(sum == n ){
            res = true;
        }
        return res;
    }
    public static void arm(int s, int e){
        for(int i = s;i<=e;i++){
            if(armstrongnumbers(i)){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        int s = 1;
        int e = 400;
        arm(s, e);
    }
}
