import java.util.*;

public class longestharmoniousSubsequence {

    static int findLHS(int[] nums) {
        
        int result = 0;
        Map<Integer, Integer> count = new HashMap<>();

        for(int i : nums){
            count.put(i, count.getOrDefault(i, 0)+1);
        }

        for(int i : count.keySet()){
            if(count.containsKey(i+1)){
                result = Math.max(result, count.get(i) + count.get(i+1));
            }
        }
        return result;
        
    }

    public static void main(String[] args) {
        
        int [] nums = {1,3,2,2,5,2,3,7};
        System.out.println(findLHS(nums));


    }
}
