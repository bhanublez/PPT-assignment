package Assignment_3;

public class serachPostion {

    static int searchInsert(int[] nums, int target) {
        int  start = 0, end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return start;
    }

    public static void main(String[] args) {

        int [] nums = {1,3,5,6}; 
        int target = 5;

        System.out.println(searchInsert(nums, target));
        
        
    }
}

