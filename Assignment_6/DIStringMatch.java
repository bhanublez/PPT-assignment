package Assignment_6;
import java.util.Arrays;

public class DIStringMatch {

    static int[] diStringMatch(String s) {
        int[] result = new int[s.length() + 1];
        int end = result.length - 1, start = 0;
        int index = 0;
        while(index < s.length()){
            if(s.charAt(index) == 'I'){
                result[index] = start;   
                start++;
            }else{
                result[index] = end;
                end--;
            }
            index++;
        }
        result[result.length - 1] = start;
        return result;
    }

    public static void main(String[] args) {

        String s = "IDID";
        
        System.out.println(Arrays.toString(diStringMatch(s)));
        
    }
    
}
