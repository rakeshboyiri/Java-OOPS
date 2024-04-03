/*
 *  4. Write a Program using Threads for the following case study:
 *  Movie Theatre To watch a movie the following process is to be followed,
 *  at first get the ticket then show the ticket. 
 *  Assume that N persons are trying to enter the Theatre hall all at once,
 *  display their seuence of entry into theater.
 *  Note: The person should enter only after getting a ticket and 
 *  showing itto the boy.
 */



import java.util.Scanner;

class entrance{
    synchronized public void enter(int person_no){
        System.out.println("Person"+person_no+" showed the ticket to the boy");
        System.out.println("Person"+person_no+" entered the Theatre");
    }
}
 
class person extends Thread{
    int person_no;   
    person(int person_no){
        this.person_no = person_no;
    }

    public void buyticket(){
        System.out.println("Person"+person_no+" bought the ticket");
    }

    public void run(){
        buyticket();
        new entrance().enter(person_no);
    }
}

public class MovieTheatre{

    public static void main(String args[]) throws InterruptedException {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the no of persons:");
        
        int n=sc.nextInt();
        
        person p[]=new person[n+1];
        entrance e=new entrance();
        
        for(int i=1;i<=n;i++){
            p[i]=new person(i);
        }

        for(int i=1;i<=n;i++)
                p[i].start();
                Thread.sleep(1000);
        }
}
