// 2. Write a program where the consumr thread checks the data production status [ is
// over or not ] for every 10 ms.


public class ConsumerThread extends Thread {
    public static long i = 1000000000;
    public void run(){
        
        while(i>0){
            i--;           
        }
    }
    public static void main(String args[]){
        ConsumerThread ct = new ConsumerThread();
        Check ch = new Check();
        ct.start();
        ch.start();
    }
}

class Check extends Thread{
    public void run(){
       
        while(true){
            if(ConsumerThread.i>0){
                System.out.println("Consumming");
                try{
                   Thread.sleep(100);
                }
                catch(Exception e){}
            }else{
                System.out.println("Consumption Over");
                break;
            }  
        
        }
    }
}

