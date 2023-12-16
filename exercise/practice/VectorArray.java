import java.util.*;
public class VectorArray {
    public static void main(String[] args) {
        //creating of vector
      Vector <Integer> v1 = new Vector<Integer>();
        v1.add(10);
        v1.add(20);
        System.out.println(v1);

        v1.add(2,30);
        v1.add(3,40);
        
        System.out.println(v1);

        v1.addFirst(50);
        System.out.println(v1);

        v1.addLast(60);
        System.out.println(v1);

        Vector <Integer> v2 = new Vector<Integer>();
        v2.addAll(v1);
        System.out.println(v2);

        v1.addElement(60);
        System.out.println(v1);

        System.out.println("Element at 0 index = "+v1.elementAt(0));

        System.out.println("First element = "+v1.firstElement());

        System.out.println("Last element = "+v1.lastElement());

        System.out.println("Get at 2 nd index "+v1.get(2));

        System.out.println("index of at 10 = "+v1.indexOf(10));

        System.out.println("after removed element at 0 index "+v1.remove(0));

        v1.set(0,100);
        System.out.println("updated first element "+v1);

        System.out.println("Capacity = "+v1.capacity());
        System.out.println("size = "+v1.size());

      //  System.out.println("contains "+v1.contains(v2));

        System.out.println("empty test "+v1.isEmpty());
    }
}
