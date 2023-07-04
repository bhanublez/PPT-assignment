package Assignment_3;
import java.util.*;
public class nextPermutation {

    static void nextPermutation(int[] arr) {
        int temp=0,i,min=Integer.MAX_VALUE,pivot=0,pos=0;
        for ( i=arr.length-1;i>=1;i--)
            if (arr[i]>arr[i-1])
            {
                pivot=i;break;
            }
        if (pivot>0)
        {
            for (i=pivot;i<arr.length;i++)
            {
                if (arr[i]>arr[pivot-1])
                    min=Math.min(min,arr[i]);
                if (min==arr[i])
                    pos=i;
            }
           
            swap(arr,pos,pivot-1);
        }

        int high=arr.length-1;
        while(pivot<=high){
            swap(arr,pivot,high);
            high--;pivot++;
        }
    }
    static void swap(int[] arr,int low,int high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
    }
    
    public static void main(String[] args) {

        int [] nums = {1,2,3};
        nextPermutation(nums);

        System.out.println(Arrays.toString(nums));
        
    }
}
