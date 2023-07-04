public class removeElement {

    static int removeElement(int[] nums, int value) {

        int cnt = 0;
        for(int i = 0; i <  nums.length; i++){
            if(nums[i] != value){
                nums[cnt] = nums[i];
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        
        int [] nums = {45,44,12,33,4};
        int val = 33;
        System.out.println(removeElement(nums, val));
    }
}
