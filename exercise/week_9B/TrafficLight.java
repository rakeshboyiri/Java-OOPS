/*
 * 3. Write a Program using Threads to simulate a traffic light. The Signal lights should glow
    after each 10 second, one by one. For example: Firstly Red, then after 10 seconds, red
    will be put to off and yellow will start glowing and then accordingly green.
 */


class RedLight extends Thread{
     public void run(){
        System.out.println("RED ON\n");
            try{
                Thread.sleep(5000);
            }catch(Exception e){}
            System.out.println("RED OFF");
            new YellowLight().start();
            
    }
}

class YellowLight extends Thread{
     public void run(){
        System.out.println("YELLOW ON\n");
            try{
                Thread.sleep(5000);
            }catch(Exception e){}
            System.out.println("YELLOW OFF");
            new GreenLight().start();
            

    }
}

class GreenLight extends Thread{
     public void run(){
        System.out.println("GREEN ON\n");
            try{
                Thread.sleep(5000);
            }catch(Exception e){}
            System.out.println("GREEN OFF");
            new RedLight().start();
    }
}

public class TrafficLight{
    public static void main(String args[]){
        RedLight red = new RedLight();

        //try{
            red.start();
            
      //  }catch(Exception e){}
    }
}
