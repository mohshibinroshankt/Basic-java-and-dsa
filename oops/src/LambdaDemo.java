import java.util.*;
import java.io.*;

class Empp{
    String name;
    double salary;
    Empp(String name,double salary){
    this.name=name;
    this.salary=salary;}
    public String toString(){ return name + " -\u2089" + salary;}
}



public class LambdaDemo {
    public static void main(String[] args) {
        List<Empp> emp = Arrays.asList(
                new Empp( "Arun", 45000), new Empp("Priya", 75000),
                new Empp( "Sarah", 55000), new Empp("Kiran", 60000)

        );

        // sort by salary

        emp.sort((Empp e1, Empp e2) -> Double.compare(e1.salary, e2.salary));
        System.out.println("Sorted by salary:");
        emp.forEach(e -> System.out.println(e));

        // Filter employees with salary >50,000 using lambda
        System.out.println("Employees with salary > 50K:");
        emp.stream()
                .filter(e -> e.salary > 50000)
                .forEach(e -> System.out.println(e.name + " " + e.salary));
    }

}
