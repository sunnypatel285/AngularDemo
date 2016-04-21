/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sunnyp
 */
public class BinarySearch {

    public static void main(String[] ar) {
        int arr[] = {2, 5, 9, 12, 15, 21, 29, 30, 36, 39, 40, 47, 50, 52, 56};
        int start = 0, end = arr.length - 1, middle = (start + end) / 2, key = 12, pos = 0;

        while (start <= end) {
            System.out.println("In loop");
            if (key > arr[middle]) {
                start = middle + 1;
            } else if (key < arr[middle]) {
                end = middle - 1;
            } else if(key == arr[middle]){
                System.out.println("Position is : "+middle);
                break;
            }
            middle = (start + end) / 2;
        }
        if(start > end){
            System.out.println("Position is : not found");
        }
        
    }
}
