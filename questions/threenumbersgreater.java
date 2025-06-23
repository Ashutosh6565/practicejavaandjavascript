package questions;

public class threenumbersgreater {
    public static void main(String[] args) {
        int m = 1;
        int n = 2;
        int o = 3;
        // int greater;
        int temp = n > m ? n:  m;
        if(temp > o){
            System.out.println(temp + " is greater ");
        }else{
            System.out.println(o + " is greater ");
        }

    }
}
