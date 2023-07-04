package Assignment_4;

import java.util.*;

public class intersectionofThreeArray {
    static List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {

        List<Integer> rst = new LinkedList<>();
        
        int i = 0, j = 0, k = 0;
        
        while (i < arr1.length && j < arr2.length && k < arr3.length) {
            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                if (rst.isEmpty() || arr1[i] != rst.get(rst.size() - 1)) rst.add(arr1[i]);
                i++;
                j++;
                k++;
            } else if (arr1[i] < arr2[j]) i++;
            else if (arr2[j] < arr3[k]) j++; 
            else k++;
        }
        
        return rst;
    }
    
    public static void main(String[] args) {

        int [] arr1 = {1,2,3,4,5}, arr2 = {1,2,5,7,9},
        arr3 = {1,3,4,5,8};
        
        System.out.println(arraysIntersection(arr1, arr2, arr3));
        
    }
}
