package Assignment_4;

import java.util.Arrays;

public class arrayPartion {
    static int arrayPairSum(int[] nums) {

        int sum = 0;
        Arrays.sort(nums);
        for(int i = 1; i < nums.length; i+=2){
            sum += Math.min(nums[i], nums[i-1]);
        }
        return sum;
    }

    public static void main(String[] args) {
        int [] nums = {1,4,3,2};
        System.out.println(arrayPairSum(nums));        
    }

}
