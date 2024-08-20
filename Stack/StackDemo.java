
class Stack{
    int top = -1;
    int size ;
    int[] arr;
    public Stack(int size){
        this.size = size;
        arr = new int[size];
    }
    void push(int data){
        if(top==size-1){
            System.out.println("Stack is Overflow");
        }else{
            arr[++top] = data;
        }
    }
    int pop(){
        if(top==-1){
            System.out.println("Stack is Underflow");
            return -1;
        }else{
            return arr[top--];
        }
    }
    void travese(){
        if(top==-1){
            System.out.println("Stack is Empty");
        }else{
            for(int i=top;i>-1;i--){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
}
public class StackDemo {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.travese();
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.travese();
    }
}
