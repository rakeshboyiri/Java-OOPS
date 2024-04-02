/*
  5. Write a Program using Threads for the following case study:
  Train Reservation system
  To reserve a berth the following process need to be followed,
  at first check the  number of
  available berths with the requested berths, 
  if the number of requested berths are less than
  or equal to availabe berths then allot berth and print ticket or else
  display no  berths are available.
  Assume that N persons are trying to reserve the berth, display their sequence of
  reservation status along with the number of available berths.
  Note : The person can print ticket only if berth is confirmed.

*/


import java.util.Scanner;
class bookticket{

    static int totalberths = 100;
    static int confirmedberths=0;
    
    synchronized public void confirm(int y){
        System.out.println("Number of available berths are:"+(totalberths-confirmedberths));

        if(confirmedberths<=totalberths&&(totalberths-confirmedberths)!=0)
        {
            System.out.println("Berth confirmed for passenger"+y);
            System.out.println("Ticket confirmed for passenger "+y+
            "with ticketnumber:"+"T"+y+(confirmedberths++));
           
            
        }
        else{
            System.out.println("Berth not confirmed for passenger"+y+",births completely filled");
        }

}
}

class passenger extends Thread{
    int y;
    public passenger(int y){
       this.y=y;
    }
    public void run(){
        new bookticket().confirm(y);
    }
}

public class Reservation{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the no of passenger:");
        int n=sc.nextInt();

        passenger p[]=new passenger[n+1];



        for(int i=1;i<=n;i++)
            p[i]=new passenger(i);
        
        for(int i=1;i<=n;i++){
            p[i].start();
           try{ p[i].join();}catch(Exception e){}
            }
    }
}
