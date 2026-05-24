public class LogicalOperators {
    public static void main(String[] args) {
        int p = 10 ;
        int q = 20 ;
        System.out.println(p<q && p<=q); // logical and
        System.out.println(p==q || p<q); // logical or
        System.out.println(!(p==q)); // logical not
    }
}
