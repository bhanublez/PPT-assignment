// Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
// You must write an algorithm with O(log n) runtime complexity.
// Input: nums = [1,3,5,6], target = 5
// Output: 2

// Input: nums = [1,3,5,6], target = 7
// Output: 4

public class question4 {
    public static int searchInsert(int[] nums, int target) {
        int i = 0, j = nums.length-1;
        while(i < j){
            int mid = (i+j)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                i = mid+1;
            }
            else{
                j = mid;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 7;
        int result = searchInsert(nums, target);
        System.out.println(result);
    }
    
}
