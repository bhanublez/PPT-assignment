package Assignment_3;


public class singleNumber2 {

    static int singleNumber(int[] nums) {

        int xor = 0;

        for(int n : nums){
            xor = xor^n;
        }
        return xor;
    }

    public static void main(String[] args) {

        int nums[] ={2,2,1};
        System.out.println(singleNumber(nums));
        
    }
}
