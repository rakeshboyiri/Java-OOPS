class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class LinkedList{
    Node head = null;
    public void insertAtBegin(int data){
        Node newNode = new Node(data);
        if(this.head==null){
            head = newNode;
            return;
        }else{
            newNode.next = this.head;
            head = newNode;
            return;
        }
    }

    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(this.head == null){
            head = newNode ;
        }else{
            Node temp = head ;
            while (temp.next!=null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    public int length(){
        if(head == null) return 0;
        Node temp = head ;
        int count = 0 ;
        while (temp!=null) {
            count++;
            temp = temp.next;
        }
        return count ;
    }
    public void insertAtPos(int pos , int data){
        int len = length();
        if(pos<0 || pos > len){
            System.out.println("Invalid Position");
            return;
        }
        Node newNode = new Node(data);
        if(this.head == null){
            head = newNode;
        }else if(pos==0){
            insertAtBegin(data);
        }
        else if(pos==len-1){
            insertAtEnd(data);
        }
        else{
            Node temp = this.head ;
            for(int i=0;i<pos-1;i++){
                temp = temp.next;
            }
            Node temp1 = temp.next;
            newNode.next = temp1;
            temp.next = newNode ;
        }
    }
    public void deleteAtBegin(){
        if(this.head == null){
            System.out.println("List is Empty");
        }else{
            head = head.next;
        }
    }
    public void deleteAtEnd(){
        if(this.head == null){
            System.out.println("List is Empty");
        }else{
            Node temp1 = this.head;
            Node temp2 = this.head;
            while (temp1.next!=null) {
                temp2 = temp1 ;
                temp1 = temp1.next;
            }
            temp2.next = null;
        }
    }
    public void display(){
        if(this.head == null){
            System.out.println("List is Empty");
        }else{
            Node temp = this.head ;
            while(temp!=null){
                System.out.print(temp.data+" -> ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
}

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtBegin(10);
        ll.insertAtBegin(20);
        ll.insertAtBegin(30);
        ll.insertAtEnd(5);
        ll.insertAtPos(0, 100);
        ll.insertAtPos(1, 200);
        ll.insertAtPos(5, 500);
        ll.display();
        System.out.println(ll.length());
        ll.deleteAtBegin();
        ll.deleteAtEnd();
        ll.display();
        System.out.println(ll.length());
    }
}
