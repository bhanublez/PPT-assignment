//Design a circular queue data structure with the following operations: enQueue, deQueue, Front, Rear, and isEmpty.

public class question8 {
    public static void main(String[] args) {
        MyCircularQueue obj = new MyCircularQueue(3);
        System.out.println(obj.enQueue(1));
        System.out.println(obj.enQueue(2));
        System.out.println(obj.enQueue(3));
        System.out.println(obj.enQueue(4));
        System.out.println(obj.Rear());
        System.out.println(obj.isFull());
        System.out.println(obj.deQueue());
        System.out.println(obj.enQueue(4));
        System.out.println(obj.Rear());
    }
    static class MyCircularQueue {
        int[] queue;
        int front;
        int rear;
        int size;
        public MyCircularQueue(int k) {
            queue = new int[k];
            front = -1;
            rear = -1;
            size = k;
        }
        
        public boolean enQueue(int value) {
            if(isFull()){
                return false;
            }else{
                if(isEmpty()){
                    front = 0;
                }
                rear = (rear + 1) % size;
                queue[rear] = value;
                return true;
            }
        }
        
        public boolean deQueue() {
            if(isEmpty()){
                return false;
            }else{
                if(front == rear){
                    front = -1;
                    rear = -1;
                }else{
                    front = (front + 1) % size;
                }
                return true;
            }
        }
        
        public int Front() {
            if(isEmpty()){
                return -1;
            }else{
                return queue[front];
            }
        }
        
        public int Rear() {
            if(isEmpty()){
                return -1;
            }else{
                return queue[rear];
            }
        }
        
        public boolean isEmpty() {
            return front == -1;
        }
        
        public boolean isFull() {
            return (rear + 1) % size == front;
        }
    }
    
}
