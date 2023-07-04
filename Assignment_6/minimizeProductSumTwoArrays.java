package Assignment_6;
import java.util.*;

public class minimizeProductSumTwoArrays {
    
    static int minProductSum(int[] nums1, int[] nums2) {
        int ans = 0;
        Arrays.sort(nums2);
        Arrays.sort(nums1);
        
        int i = 0;
        int j = nums2.length-1;
        while(i < nums1.length && j >= 0)
        {
            ans += nums1[i] * nums2[j];
            i++;
            j--;
        }
        
        return ans;
    }

    public static void main(String[] args) {

        int [] nums1 = {5,3,4,2}, nums2 = {4,2,2,5};
        System.out.println(minProductSum(nums1, nums2));
        
    }
}
