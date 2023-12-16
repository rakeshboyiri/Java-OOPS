/*
 *  5. Create an Interface Fare with method getAmount() to get the amount 
 *  paid  for fare of travelling. Calculate the fare paid by bus and train
 *  implementing interface Fare.
 */

public interface Fare {
    void getAmount();
}
class Bus implements Fare{

    int amount ;
    public Bus(int amount){
        this.amount = amount;
    }
    @Override
    public void getAmount() {
        System.out.println("Fair paid by Bus = "+amount);
    }
    
}

class Train implements Fare{

   
    int amount ;
    public Train(int amount){
        this.amount = amount;
    }
    @Override
    public void getAmount() {
        System.out.println("Fair paid by train = "+amount);
    }
    
}
class FareBusTrain{
    public static void main(String args[]){
        Bus bus = new Bus(100);
        Train train = new Train(200);
        bus.getAmount();
        train.getAmount();
    }
}