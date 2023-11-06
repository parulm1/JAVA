package LinkedList;
class Node{
    int data;
    Node next;
}

public class TestLinkedList {
    Node head,middle,last;
    void createList(){
         head = new Node();
        middle = new Node();
        last = new Node();
        
        head.data=10;
        middle.data=20;
        last.data=30;
        
        head.next=middle;
        middle.next=last;
        last.next=null;
    }
    
    void showList(){
        Node temp=head;
        while(temp != null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        TestLinkedList ll = new TestLinkedList();
        ll.createList();
        ll.showList();
       
    }
}
