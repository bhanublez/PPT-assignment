import java.util.Arrays;

public class plusOne {

    static int[] plusOne(int[] digits) {

        int n = digits.length;

        for(int i = n-1; i >= 0; i--){

            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            else{
                digits[i] = 0;
            }
        }
        if(digits[0] == 0){
            int arr[] = new int[n + 1];
            arr[0] = 1;
            return arr;
        }
        return digits;
    }

    public static void main(String[] args) {
        int [] nums = {4,41,32,4,54,2,5};
        System.out.println(Arrays.toString(plusOne(nums)));
    }
}
