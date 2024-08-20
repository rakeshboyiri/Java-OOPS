class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }

}

public class LinkedListClass{

    //Add Node Function
    public static Node  addNode(Node head,int data) {
        Node newNode = new Node(data);
        if(head == null) {
            return newNode;
            
        } else {
            Node current = head;
            while(current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }

        return head;
    }

    //Display Function
    public static void display(Node head) {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

        //Add Node At Begin
        public static Node addAtBegin(Node head,int data){
            Node newNode = new Node(data);
            if(head==null){
                return newNode;
            }else{
                newNode.next = head;
                return newNode;
            }
            
        }
    public static void main(String[] args) {
        Node head = null;
        head = addNode(head,10);
        head = addNode(head,20);
        head = addNode(head,30);
        head = addNode(head,40);
        head = addAtBegin(head, 50);
       display(head);
        
    }
}
    