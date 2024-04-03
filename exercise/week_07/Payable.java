/*
 *  3. Create an Interface payable with method getAmount ().Calculate the amount to be
    paid to Invoice and Employee by implementing Interface.
 */

public interface Payable {
    public void getAmount();
}

class PayableCalculate implements Payable{

    @Override
    public void getAmount() {
        System.out.println("Amount paid to Invoice");
        System.out.println("Amount paid to Employee");
    }
    
}
class Pay{
    public static void main(String args[]){
        PayableCalculate pc = new PayableCalculate();
        pc.getAmount();
    }
}