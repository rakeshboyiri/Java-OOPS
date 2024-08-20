class Node {

    int data;
    Node next;
    Node prev;
    public Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null ;
    }
}
class DoubleLinkedList{
    Node head = null;
    void add(int data){
        Node newNode = new Node(data);
        if(this.head == null){
            head = newNode;
        }else{
            Node temp = this.head ;
            while (temp.next!=null) {
                temp = temp.next;
            }
            newNode.prev = temp ;
            temp.next = newNode;
        }
    }
    void display(){
        if(this.head==null){
            System.out.println("List is Empty");
        }else{
            Node temp = this.head ;
            while(temp!=null){

                System.out.print(temp.data +" -> ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
}

public class DoubleLinkedListDemo {

    public static void main(String[] args) {
        DoubleLinkedList dll1 = new DoubleLinkedList();
        dll1.add(10);
        dll1.add(20);
        dll1.add(30);
        dll1.display();

    }
}
