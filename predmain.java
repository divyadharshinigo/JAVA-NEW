package DD;

import java.io.*;
import java.util.*;
import DD.*;

//import static predicateinf.*;
//import static.DD.predicateinf.*;
public class predmain {
    public static void main(String args[]) {
        Employee e = new Employee(23, "dd", 22, "F");
        Employee e1 = new Employee(34, "dfhj", 28, "M");
        Employee e2 = new Employee(3, "ddfg", 20, "F");
        List<Employee> li = new ArrayList<Employee>();
        li.addAll(Arrays.asList(new Employee[] { e, e1, e2 }));

        predicateinf fi = new predicateinf();

        System.out.println(fi.fop(li, fi.isAdultMale()));
        System.out.println(fi.fop(li, fi.isAdultFemale()));
        System.out.println(fi.fop(li, fi.isAdultAge()));

    }
}