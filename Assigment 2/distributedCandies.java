import java.util.*;

public class distributedCandies {

    static int distributeCandies(int[] can) {
        
        Set<Integer> set = new HashSet<>();
        for(int i : can){
            set.add(i);
        }
        return Math.min(can.length/2, set.size());
    }

    public static void main(String[] args) {

        int [] candyType = {6,6,6,6};
        System.out.println(distributeCandies(candyType));  
        
    }
}
