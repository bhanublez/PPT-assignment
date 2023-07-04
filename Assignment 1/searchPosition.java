public class searchPosition {

    static int searchInsert(int[] nums, int target) {
        int  start = 0, last = nums.length - 1;
        while(start <= last){
            int mid = start + (last - start)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] < target){
                start = mid + 1;
            }
            else{
                last = mid - 1;
            }
        }
        return start;
    }

    public static void main(String[] args) {

        int [] arr = {13,23,35,44,3,4,3,2};
        int target = 3;
        System.out.println(searchInsert(arr, target));
        
    }
}
