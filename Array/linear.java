package Array;

public class linear {
    public static int number(int arr [],int  target){
        for(int i = 0;i< arr.length;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr [] = {1,2,3,4};
        int result = number(arr, 3);
        System.out.println(result);
    }
}
