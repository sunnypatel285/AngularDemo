/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sunnyp
 */
public class RodCutting {
    
    public int Cut_Rod(int p[], int n) throws Exception{
        if(n >= p.length ){
            throw new Exception("rod of length can not grater than the price array length");        
        }
        if (n == 0) {
            return 0;
        }
        int q = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            q = Math.max(q, (p[i] + Cut_Rod(p, n - i)));
        }
        return q;
    }
    
    public static void main(String[] args) throws Exception{
        int[] p = {3, 5, 8, 9, 10, 17, 17, 20, 0};
        RodCutting rd = new RodCutting();
        int q = rd.Cut_Rod(p, 8);
        System.out.println(q);
    }
}
