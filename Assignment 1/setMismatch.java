import java.util.Arrays;

public class setMismatch {

    static int[] findErrorNums(int[] nums) {
        int du = 0, missing = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == nums[i+1]){
                du = nums[i];
                missing = nums[i] + 1;
                break;
            }
        }
        int [] arr = {du, missing};
        return arr;
        
    }

    public static void main(String[] args) {
        int [] nums = {11,12,13,13,15,16,17,17};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }
}
