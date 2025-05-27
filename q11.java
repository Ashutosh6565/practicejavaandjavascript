import java.util.Scanner;

public class q11 {
    public static boolean isPalindrom(String str){
        int left = 0;
        int right = str.length() - 1;
        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if(isPalindrom(str)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
