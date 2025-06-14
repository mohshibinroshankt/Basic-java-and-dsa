class Employeee {
    String company="CTS";

    void work(){
        System.out.println("Employee work at : "+company);
    }
}

class Developer extends Employeee {
    void develop(){
        System.out.println("Developer writes code");
    }
}

public class Inheritance_demo {
    public static void main(String[] args) {
        Developer developer = new Developer();
        developer.work();
        developer.develop();

    }
}
