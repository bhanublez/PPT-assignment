// 6.	Given a singly linked list of size N. The task is to left-shift the linked list by k nodes, where k is a given positive integer smaller than or equal to the length of the linked list.
// Input: N = 5
// value[] = {2, 4, 7, 8, 9}
// k = 3
// Output: 8 9 2 4 7
// Explanation:Rotate 1:4 -> 7 -> 8 -> 9 -> 2
// Rotate 2: 7 -> 8 -> 9 -> 2 -> 4
// Rotate 3: 8 -> 9 -> 2 -> 4 -> 7
package Assignment_10;

public class question6 {
    
    public static void main(String[] args) {
        int arr[]={2,4,7,8,9};
        int k=3;
        int arr1[]=new int[arr.length];
        int i=0;
        while(i<k){
            arr1[i]=arr[arr.length-k+i];
            i++;
        }
        int j=0;
        while(i<arr.length){
            arr1[i]=arr[j];
            i++;
            j++;
        }
        for(int l=0;l<arr1.length;l++){
            System.out.print(arr1[l]+" ");
        }

    }
}
