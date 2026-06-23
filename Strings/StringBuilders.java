package Strings;

public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        System.out.println(s.length()+" "+s.capacity());
        s.append("raghav");
        System.out.println(s);
        System.out.println(s.length()+" "+s.capacity());
        s.append(" Garg");
        System.out.println(s);
        s.setCharAt(1,'o');
        System.out.println(s);

    }
}
