// Design an algorithm that accepts a stream of integers and retrieves the product of the last k integers of the stream.

// Implement the ProductOfNumbers class:

// ProductOfNumbers() Initializes the object with an empty stream.
// void add(int num) Appends the integer num to the stream.
// int getProduct(int k) Returns the product of the last k numbers in the current list. You can assume that always the current list has at least k numbers.
//The test cases are generated so that, at any time, the product of any contiguous sequence of numbers will fit into a single 32-bit integer without overflowing.

import java.util.ArrayList;
import java.util.List;

public class productOfLastKNumber {
    public static void main(String[] args) {
        ProductOfNumbers obj = new ProductOfNumbers();
        obj.add(3);
        obj.add(0);
        obj.add(2);
        obj.add(5);
        obj.add(4);
        System.out.println(obj.getProduct(2));
        System.out.println(obj.getProduct(3));
        System.out.println(obj.getProduct(4));
        obj.add(8);
        System.out.println(obj.getProduct(2));
    }
    static class ProductOfNumbers {
        List<Integer> list;
        public ProductOfNumbers() {
            list = new ArrayList<>();
        }
        
        public void add(int num) {
            if(num == 0){
                list = new ArrayList<>();
            }else{
                if(list.size() == 0){
                    list.add(num);
                }else{
                    list.add(list.get(list.size() - 1) * num);
                }
            }
        }
        
        public int getProduct(int k) {
            if(k > list.size()){
                return 0;
            }else if(k == list.size()){
                return list.get(list.size() - 1);
            }else{
                return list.get(list.size() - 1) / list.get(list.size() - k - 1);
            }
        }
    }
}
