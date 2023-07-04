package Assignment_5;
import java.util.*;

public class findAllDuplicatesInAnArray {
    static List<Integer> findDuplicates(int[] nums) {

        ArrayList<Integer> al=new ArrayList<>();
		 HashMap<Integer,Integer> map=new HashMap<>();
		 if(nums.length==1){
			 return al;
		 }
		 for(int i=0;i<nums.length;i++) {
			 map.put(nums[i],map.getOrDefault(nums[i],0)+1);
		 }
		 for(int i:map.keySet()) {
			 if(map.get(i)>1) {
				 al.add(i);
			 }
		 }
		 Collections.sort(al);
		 return al;        
    }

    public static void main(String[] args) {

        int [] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(nums));
        
    }
}
