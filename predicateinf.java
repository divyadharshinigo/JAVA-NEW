package DD;

import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.lang.String.*;
import java.util.*;
//import java.lang.String.equalsignorecase;

public class predicateinf {
    public static Predicate<Employee> isAdultMale() {
        return p -> p.getAge() > 21 && p.getGender().equalsIgnoreCase("M");
    }

    public static Predicate<Employee> isAdultFemale() {
        return p -> p.getAge() > 21 && p.getGender().equalsIgnoreCase("F");
    }

    public static Predicate<Employee> isAdultAge() {
        return p -> p.getAge() > 18;
    }

    public static List<Employee> fop(List<Employee> li, Predicate<Employee> predicate) {
        return li.stream().filter(predicate).collect(Collectors.<Employee>toList());
    }

}