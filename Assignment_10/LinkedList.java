package Assignment_10;
// 1.	Delete Node in a Linked List
// 2.	Remove Linked List Elements

public class LinkedList{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data= data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //Methods for insertion
    public synchronized void insertAtBegin(int data){
        Node newNode= new Node(data);//created new node
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }       
        newNode.next=head;//linked nodes
        head=newNode;//head position changed
    }

    //Finding middle term using two pointer approach
    public static int middleTerm(){
        Node fast=head,slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.data;
    }
    public synchronized void insertAtLast(int data){
        Node newNode= new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public synchronized void insertionAtMiddle(int data,int index){
        if(index==0){
            insertAtBegin(data);
            return;
        }
        Node newNode= new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<(index-1)){
            temp=temp.next;
            i++;
        }   
        newNode.next=temp.next;
        temp.next=newNode;

    }

    //Method to Display Linked list
    public void Display(){
       if(head==null){
        System.out.println("Linked List is Empty");
        return;
       }
        Node temp=head;
        while(temp!=null){
            System.out.print(" "+temp.data);
            temp=temp.next;
        }System.out.println();

    }

    //Method for Deletion
    public synchronized void deletionAtBegin(){
       if(size==0){
        System.out.println("Linked List is already empty");
        return ;
       }
       if(size==1){
        head=tail=null;
        size=0;
        return;
       }
        head=head.next;
        size--;

    }
    public synchronized void deletionAtLast(){
        if(size==0){
            System.out.println("Linked List is already empty");
            return ;
           }
           if(size==1){
            head=tail=null;
            size=0;
            return;
           }
           Node temp=head;;
           while(temp.next!=tail){
            temp=temp.next;
           }
        tail=temp;
        tail.next=null;
        size--;

    }
    public synchronized void deletionAtMiddle(int index){
        if(size==0){
            System.out.println("Linked List is already empty");
            return ;
           }
           if(size==1){
            head=tail=null;
            size=0;
            return;
           }
           Node temp=head;
           int i=0;
           while(i<(index-1)){
            temp=temp.next;
            i++;
           }
           temp.next=temp.next.next;
    }



    public static void main(String ar[]){
        LinkedList ll = new LinkedList();
        ll.Display();
        ll.insertAtBegin(1);
        ll.insertAtBegin(2 );
       
        ll.insertAtLast(4);
        ll.insertAtLast(5);
        ll.Display();
        ll.deletionAtBegin();
        ll.Display();
        ll.insertionAtMiddle(45,2);
        ll.Display(); 
        System.out.println(" "+size);
        ll.deletionAtLast();
        ll.Display();
        ll.deletionAtMiddle(1);
        ll.Display();
    }
}