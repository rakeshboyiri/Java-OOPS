//Constructor in Java ...
/*
 * Constructor is also similar to methods but it calls when an object is created
 * Implicit constructor and Non-implicit constructor
 */

public class constructor {
    public int num = 100;
    public static void main(String[] args){

        constructor con = new constructor();
        System.out.println(con.num);
    }

    public constructor(int n){
        num = n;
    }
    public constructor(){
      num = 1000;
    }
}
