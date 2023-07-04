
public class containsDuplicate {

    static boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        //Example 1
        int [] nums1 = {35,7,341,15,53,34,3,4,54,35,54,345,34};
        System.out.println(containsDuplicate(nums1));
        //example 2
        int [] nums2 = {1,2,3,4,5,6};
        System.out.println(containsDuplicate(nums2));
        
    }
}
