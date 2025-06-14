class Emp2{
    void work(){
        System.out.println("Working");
    }
}

class Manager extends Emp2{

    void manage(){
        System.out.println("Managing Team");
    }
}

class SeniorManager extends Manager{
    void strategy(){
        System.out.println("planning strategy");
    }
}
public class Multi_level_inheritance {
    public static void main(String[] args) {
        SeniorManager sen = new SeniorManager();
        sen.manage();
        sen.strategy();
        sen.work();
    }
}
