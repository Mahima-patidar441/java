package Sorting;

public class UnionOfTwoArray {
    public static void main(String[] args) {
        int[] a = {2,3,4,6,8,10};
        int[] b = {3,5,6,11,12};
        int m = a.length;
        int n = b.length;
        int[] c = new int[m+n];
        int i = 0 , j = 0 , k = 0 ;
        while(i!=m && j!=n){
            if(a[i]==b[j]){
                c[k]=a[i];
                i++;
                j++;
                k++;
            }
            else{
                if(a[i]>b[j]){
                    c[k] = b[j];
                    j++;
                    k++;
                }
                else{
                    c[k] = a[i];
                    i++;
                    k++;
                }
            }
        }
        if(i==m){
            while(j<n){
                c[k]= b[j];
                k++;
                j++;
            }
        }
        if(i==n){
            while(i<m) {
                c[k] = a[i];
                k++;
                i++;
            }
        }
        for (int ele : c){
            System.out.print(ele+" ");
        }

    }
}
