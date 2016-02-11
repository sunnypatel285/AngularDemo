/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sunnyp
 */
public class indexOfString {
    
    public static void main(String[] ar){
        System.out.println(findIndexOf("abcdefghijk", "gqhi"));
        SpecialCharacterField s = SpecialCharacterField.PLUS;
        System.out.println(s);
    }
    
    public static boolean findIndexOf(String s, String m){
        char[] s1 = s.toCharArray();
        char[] m1 = m.toCharArray();
        int z = 0;
        for(int i=0;i < s.length()-m.length()-1;i++){
            if(s.substring(i, i+m.length()).equalsIgnoreCase(m)){
                return true;
            }
        }
        return false;
    }
    
    public void test(){
        
    }
}

class TechnoSample {
    public static void main(String argv[]) {
        TechnoSample inc = new TechnoSample();
        int i =0;
        inc.fermin(i);
        i = i++;
        System.out.println(i);
    }
    void fermin(int i) {
        i++;
    }
}


