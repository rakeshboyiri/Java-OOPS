public class Test extends Thread{
    synchronized public void run(){
        for(int i =1 ; i<= 5 ; i++){
            System.out.println(i);
        }
    }

    public static void main(String args[]){
        Test t1 = new Test();
        Test t2 = new Test();
        t1.start();
        t2.start();
    }
}