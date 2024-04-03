/*
  1. Write a program to create MyThread class with run() method and then attach a thread to
  this MyThread class object.
*/

class MyThreads extends Thread{
    public void run(){
        for(int i = 0 ; i<=10 ; i++){
            System.out.println(i);
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException e){
                e.getMessage();
            }
        }
    }

}
public class MyThread{
    public static void main(String[] args) {
        Thread th1 = new Thread(new MyThreads());
        Thread th2 = new Thread(new MyThreads());
        th1.start();
        
        th2.start();
        System.out.println(Thread.currentThread().getId());
       
    }
}
