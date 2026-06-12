package Arrays;

public class ProductOfArray {
    public static void main(String[] args) {
        int[] arr = { 4,2,3,-1,6,12};
        int product = 1 ;
        for (int i=0 ; i<arr.length ; i++){
            product *= arr[i];
        }
        System.out.println(product);
    }
}
