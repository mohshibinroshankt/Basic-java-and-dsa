class Emp3{
    void attendance(){
        System.out.println("Marking Attendance");
    }
}

class Develop extends Emp3{
    void code(){
        System.out.println("Develop code");
    }
}
class Test extends Emp3{
    void test(){
        System.out.println("Testing");
    }
}

public class Hierarchical_inheritance {
    public static void main(String[] args) {
        Develop obj = new Develop();
        obj.attendance();
        obj.code();

        Test obj2 = new Test();
        obj2.test();
        obj2.attendance();
    }
}
