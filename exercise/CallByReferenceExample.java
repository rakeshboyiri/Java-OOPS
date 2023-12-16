class MyObject {
    int value;

    MyObject(int value) {
        this.value = value;
    }
}

public class CallByReferenceExample {
    public static void main(String[] args) {
        MyObject obj = new MyObject(10);
        System.out.println("Before modification: " + obj.value);
        modifyObject(obj);
        System.out.println("After modification: " + obj.value);
    }

    static void modifyObject(MyObject obj) {
        obj.value = 20;
    }
}
