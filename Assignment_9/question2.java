// Given an array of integer nums sorted in non-decreasing order, find the starting and ending position of a given target value.
// If the target is not found in the array, return [-1, -1].
// You must write an algorithm with O(log n) runtime complexity
// Input: nums = [5,7,7,8,8,10], target = 8
// Output: [3,4]

public class question2 {
      
        public static int[] searchRange(int[] nums, int target) {
            int[] result = new int[2];
            int i = 0, j = nums.length-1;
            while(i < j){
                if(nums[i] == target && nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                    break;
                }
                else if(nums[i] < target){
                    i++;
                }
                else if(nums[j] > target){
                    j--;
                }
                else{
                    result[0] = -1;
                    result[1] = -1;
                    break;
                }
            }
            return result;
        }
    
        public static void main(String[] args) {
            int[] nums = {5,7,7,8,8,10}, result;
            int target = 8;
            result = searchRange(nums, target);
            System.out.println(result[0] + " " + result[1]);
        }
    
}
