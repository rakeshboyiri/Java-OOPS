/*
 *  3. Write a JAVA program for the following
    a. Call by value
    b. Call by object
 */

import java.util.Scanner;
public class CallBy {
    int val ;

    public CallBy(int val){
        this.val = val;
    }
    void callByValue(int num){
        System.out.println("call by value = "+num);
    }

    void callByObject(CallBy obj){
        System.out.println("call by object = "+obj.val);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int num = sc.nextInt();
        CallBy obj = new CallBy(num);
        obj.callByValue(obj.val);
        obj.callByObject(obj);

        sc.close();
    }
}
