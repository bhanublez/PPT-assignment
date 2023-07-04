package Assignment_6;
public class contiguousArray {
    
    static int findMaxLength(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int zeros = 0, ones = 0;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] == 0) {
                    zeros++;
                } else {
                    ones++;
                }
                if (zeros == ones) {
                    count = Math.max(count, j - i + 1);
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int [] nums = {0,1};
        System.out.println(findMaxLength(nums));
        
    }
}
