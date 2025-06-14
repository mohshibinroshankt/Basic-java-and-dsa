import java.util.*;
import java.util.stream.*;

class Emp {
    String name;
    double salary;

    Emp(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class Stream_API_ex {
    public static void main(String[] args) {
        List<Emp> empList = new ArrayList<>();
        Emp emp1 = new Emp("Rahul", 150000.00);
        Emp emp2 = new Emp("Mohana", 350000);
        Emp emp3 = new Emp("Vino", 520000.90);

        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);

        empList.stream()
                .filter(emp -> emp.salary > 300000)
                .forEach(emp -> System.out.println(emp.name + " " + emp.salary));
    }
}
