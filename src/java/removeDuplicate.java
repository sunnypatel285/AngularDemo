
import java.util.HashSet;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sunnyp
 */
public class removeDuplicate {
    
    public static void main(String[] ar){
        System.out.println(removeDup("banana"));
        System.out.println(removeDup("banaweertna"));
    }
    
    public static String removeDup(String str){
        boolean[] b = new boolean[256];
        int dst = 0;
        char[] d = new char[str.length()];
        for(int i=0;i<str.length();i++){
            if(b[str.charAt(i)]){
            }else{
                b[str.charAt(i)] = true;
                d[dst++] = str.charAt(i);
            }
        }
        return new String(d, 0, dst);
    }
    
    public static String removeUsingSet(String str){
        Set<Character> s = new HashSet<Character>();
        for(int i=0;i<str.length();i++){
            s.add(str.charAt(i));
        }
        Character[] c1 = s.toArray(new Character[s.size()]);
        return String.valueOf(c1);
    }
}
