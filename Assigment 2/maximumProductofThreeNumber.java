
import java.util.Arrays;

public class maximumProductofThreeNumber {

    static int maximumProduct(int[] nums) {

        int n = nums.length;
        Arrays.sort(nums);
        int product = Math.max(nums[0] * nums[1] * nums[n-1] , 
        nums[n-1] * nums[n-2] * nums[n-3]);
        return product;
    }

    public static void main(String[] args) {

        int [] nums = {1,2,3,-7,4,5,6,-8};
        System.out.println(maximumProduct(nums));
        
    }
}
