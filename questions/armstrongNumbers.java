package questions;

public class armstrongNumbers {
    public static void armstrongnumbers(int n ){
        int temp = n;
        int digit = 0;
        int sum = 0;
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
            System.out.println("the number is a armstrong number");
        }else{
            System.out.println("the number is not a armstrong number ");
        }

    }
    public static void main(String[] args) {
        int n = 371;
        armstrongnumbers(n);
    }
}
