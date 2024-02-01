/*
 * 4. Write a java program : rolling a pair of dices 10 times [ each attempt should be delayed
    by 10000 ms ] and count number Successful attempts.
    successful attempt : If the pair of Dice results in same values.
 */


import java.util.Random;
public class DiceRoll {
    public static void main(String[] args) throws InterruptedException {
        int dice1,dice2,count=0;
        for(int i = 0 ; i<10 ; i++){
            dice1 = new Random().nextInt(1,7);
            dice2 = new Random().nextInt(1,7);
            System.out.println("Dice 1 = "+dice1+" Dice 2 = "+dice2);
            if(dice1==dice2){
                count++;
            }
            //Thread.sleep(2000);
        }
        System.out.println("Successful Attempts = "+count);
    
    }
}
