
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
public class CommonElementArray {
    
    public static void main(String[] a){
        int[] array1 = new int[]{2,5,8,64,23,48,21,33,98,70,46};
        int[] array2 = new int[]{6,1,9,11,17,34,56,32,21,73,49};
        System.out.println(findCommon(array1, array2));
    }
    
    public static int findCommon(int[] a1, int[] a2){
        Set s = new HashSet<Integer>();
        for(int i=0;i<a1.length;i++){
            s.add(a1[i]);
        }
        for(int j=0;j<a2.length;j++){
            if(!s.add(a2[j])){
                return a2[j];
            }
        }
        return 0;
    }
    
}
