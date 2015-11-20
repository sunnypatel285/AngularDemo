
import java.util.ArrayList;
import java.util.HashSet;
import java.util.*;


public class TestFirstApp {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        int m = 4, n = 6;
        System.out.println(m -= m - n);
        String s = "abcdrefkjmk";
        System.out.println(s.codePointAt(0) - '0');
        System.out.println(reverse("abcf"));
        Set<Integer> s1 = new HashSet<Integer>();
        s1.add(2);
        s1.add(55);
        Integer[] ss =  s1.toArray(new Integer[s1.size()]);
        List al = new ArrayList();
        
        System.out.println("Len :: "+ss.length);
        
        Date d1 = new Date(1378751400000L);
        System.out.println(d1);
    }

    public static String reverse(String s){
        if(s.length() < 2){
            return s;
        }
        //sb.append(s.substring(s.length()-1));
        return reverse(s.substring(1)) + s.charAt(0);
    }
}
