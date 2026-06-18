package Arrays;

public class Segregation0and1 {
    public static void main(String[] args) {
        // TWO PASS SOLUTION
//        int[] arr = {0,1,1,1,1,0,0,1,0,1,0,0};
//        int NumberOfZero = 0;
//        int NumberOfOne = 0;
//        for(int ele : arr){
//            if(ele==0) NumberOfZero++;
//            else NumberOfOne++;
//        }
//        for(int i = 0 ; i < NumberOfZero ; i++){
//            arr[i] = 0 ;
//        }
//        for(int i = NumberOfZero; i <arr.length ; i++){
//            arr[i] = 1;
//        }
//        for(int ele : arr){
//            System.out.print(ele+" ");
//        }
//
       // TWO POINTER TECHNIQUE
        int[] arr = {0,1,1,1,1,0,0,1,0,1,0,0};
        int i=0 ;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]==0) i++;
            else if(arr[j]==1) j--;
            else if(arr[i]==1 && arr[j]==0){
                arr[i] = 0 ;
                arr[j] = 1 ;
                i++;
                j--;
            }
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }


    }

}
