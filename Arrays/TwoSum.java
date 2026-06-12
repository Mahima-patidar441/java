package Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,4,5,7,6,9,5};
        int target = 110;
        boolean flag = false;
        for (int i = 0 ; i < arr.length-1 ; i++){
            for (int j = i+1 ; j < arr.length ; j++){
                if (arr[i] + arr[j] == target){
                    flag = true;
                    break;

                }
            }
        }
        if(flag == true) {
            System.out.println("There exist two elements with target sum");
        }
        else{
            System.out.println("no such elements exist in array");
        }
    }
}
