package Assignment_3;
import java.util.Arrays;

public class sumCloset {

    static int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);
        int resultSum = nums[0] + nums[1] + nums[2];
        int closest = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length - 2; i++){

            int left = i + 1;
            int right = nums.length - 1;

            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];

                if(sum == target){
                    return target;
                }
                if(sum < target){
                    left ++;
                }
                else {
                    right --;
                }
                int diff = Math.abs(sum - target);
                if(diff < closest){
                    resultSum = sum;
                    closest = diff;
                }
            }
        }
        return resultSum;
    }
    
    public static void main(String[] args) {

        int [] nums = {-1,2,1,-4};
        int target = 1;

        System.out.println("Closest Sum is as -> " + threeSumClosest(nums, target));
        
    }
}
