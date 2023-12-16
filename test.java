public class test {
    static int num = 100;
    public static void main(String[] args){
        int list[] = {1,2,3,4,5};

        Loop lo = new Loop();
        lo.acend(list, 0, 5);
        lo.decend(list, 5);
        lo.acend(list, 0, 2);
    }
}