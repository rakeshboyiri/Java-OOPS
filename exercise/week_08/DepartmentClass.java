package Department;
import dept.*;

public class DepartmentClass{
    public static void main(String args[]){
        CSE cse = new CSE();
        ECE ece = new ECE();
        ME me = new ME();
        CE ce = new CE();

       cse.firstYear();
       ece.firstYear();
       me.firstYear();
       ce.firstYear();
    }
}



