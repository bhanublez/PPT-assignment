// Given an array of integers, find the inversion of an array. Formally, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j.
// N=5, arr[] = {2, 4, 1, 3, 5}
// Output: 3
// Explanation: (2,1) (4,1) and (4,3) forms an inversion in an array

public class question7 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5};
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
