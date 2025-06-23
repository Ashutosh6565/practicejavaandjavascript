package Array;

public class largestNumber {
    public static int number(int arr []){
        int max = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < small){
                small = arr[i];
            }
        }
        return small;
    }
    public static void main(String[] args) {
        int arr [] = {1,2,6,3,5};
        int result = number(arr);
        System.out.println(result);
    }
}
