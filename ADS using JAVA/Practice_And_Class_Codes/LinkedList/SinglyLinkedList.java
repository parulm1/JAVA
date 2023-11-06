package LinkedList;

class Node{
    int data;
    Node next;
}

public class SinglyLinkedList {
    Node head;
    int size;
    void addFirst(int value){
        Node newNode = new Node();
        newNode.data=value;
//        newNode.next=head;
//        head=newNode; //Shifting of head to newNode
    }
    
    void addLast(int value){
        Node newNode = new Node();
        newNode.data=value;
        if(head==null)
            head=newNode;
        else{
            Node lastNode = head;
            while(lastNode.next != null){
                lastNode=lastNode.next;
            }
            lastNode.next = newNode;
        }
    }
    
    
    public void deleteNode(int value) {
        if(head.data==value) {
            head=head.next;
        }else{
            Node temp = head;
            while(temp.next!=null){
                if(temp.next.data==value){
                    temp.next=temp.next.next;
                 break;
                }
                temp=temp.next;
            }
        }    
    }
    
    boolean searchNode(int value){
        Node temp=head;
        while(temp!=null){
            if(temp.data==value)
                return true;
                temp=temp.next;
            }
           return false;     
        }
    
    
    void printList(){
        Node temp=head;
        while(temp != null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }   
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.addFirst(10);
        sll.addFirst(20);
        sll.addFirst(30);
        sll.addFirst(40);
        sll.addFirst(50);
        sll.addLast(100);
        sll.deleteNode(10);
        System.out.println(sll.searchNode(100));
        
        
        sll.printList();
    }
}
