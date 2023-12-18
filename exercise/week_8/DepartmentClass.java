import dept.CSE;
import dept.ECE;
import dept.ME;
import dept.CE;

public class DepartmentClass{
    public static void main(String args[]){
        CSE cse = new CSE();
        ECE ece = new ECE();
        ME me = new ME();
        CE ce = new CE();

        cse.subjects();
        ece.subjects();
        me.subjects();
        ce.subjects();
    }
}



