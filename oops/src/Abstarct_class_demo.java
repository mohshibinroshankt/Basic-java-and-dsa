abstract class Employe{
    protected String name;
    protected int salary;

    public Employe(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void printEmployee() {
        System.out.println(this.name);
        System.out.println(this.salary);
    }

    public abstract double calculateSalary();
}

class FullTimeEmployee extends Employe{
    private double bonus;
    public FullTimeEmployee(String name, int salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }
// we can remove the override if we change the above class to another abstract class
    @Override
    public double calculateSalary() {
        return salary + bonus;
    }
}

class ContractEmployee extends Employe{
    private int contractHours;
    private double hourlyRate;
    public ContractEmployee(String name, int salary, int bonus, int contractHours, double hourlyRate) {
        super(name, salary);
        this.contractHours = contractHours;
        this.hourlyRate = hourlyRate;

    }

    @Override
    public double calculateSalary() {
        return salary + contractHours * hourlyRate;

    }


}
public class Abstarct_class_demo {
    public static void main(String[] args) {
        Employe e1 = new FullTimeEmployee("John Doe", 5000, 0.5);
        System.out.println("Total Salary :" +e1.calculateSalary());
        e1.printEmployee();

        System.out.println("========================");
        Employe e2 = new ContractEmployee("Rosey", 55000,4000, 500,500);
        System.out.println("Total Salary :" +e2.calculateSalary());
        e2.printEmployee();
    }
}
