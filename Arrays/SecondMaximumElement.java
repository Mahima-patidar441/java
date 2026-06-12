package Arrays;

public class SecondMaximumElement {
    public static void main(String[] args) {
        int[] arr = { 9,2,4,6,10,19,25};
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for (int i = 0 ; i < arr.length ; i++){
            if (arr[i] > max ){
                max = arr[i];
            }
        }
        for (int i = 0 ; i < arr.length ; i++) {
            if (arr[i] > smax && arr[i] != max){
                smax = arr[i];
            }
        }
        System.out.println("Maximum element : "+max);
        System.out.println("Second Maximum element : "+smax);
    }
}
