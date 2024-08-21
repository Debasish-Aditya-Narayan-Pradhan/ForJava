import  java.util.*;

public class practice {
    public static void main(String[] args) {
        Set<Integer> st = new HashSet<>();
        st.add(10);
        st.add(12);
        st.add(15);
        st.add(16);
        System.out.println(st);
        Integer i = 43;
        String s = "ab0";
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String s2 = sb.toString();

        System.out.println(s2.equals(s));
        System.out.println(s.contains("0"));
    }
}
