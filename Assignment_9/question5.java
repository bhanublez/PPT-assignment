// Find the majority element in the array. A majority element in an array A[] of size n is an element that appears more than n/2 times (and hence there is at most one such element). 
// Input: A[]={3, 3, 4, 2, 4, 4, 2, 4, 4}
// Output: 4
// Explanation: The frequency of 4 is 5 which is greater than half of the size of the array size. 

public class question5 {
    public static int findMajority(int[] nums) {
        int count = 0, candidate = 0;
        for(int i = 0; i < nums.length; i++){
            if(count == 0){
                candidate = nums[i];
            }
            if(nums[i] == candidate){
                count++;
            }
            else{
                count--;
            }
        }
        return candidate;
    }

    public static void main(String[] args) {
        int[] nums = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        int result = findMajority(nums);
        System.out.println(result);
    }
    
}
