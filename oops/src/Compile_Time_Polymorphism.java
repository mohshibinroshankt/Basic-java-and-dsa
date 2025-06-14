class Calculator{
    public int add(int a, int b){
        return a+b;

    }

    public int add(int a, int b, int c){
        return a*b*c;
    }

    public float add(float a, float b){
        return a/b;
    }
}


public class Compile_Time_Polymorphism {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(1,2));
        System.out.println(c.add(1,2,3));
        System.out.println(c.add(10.5f, 2.0f));

    }
}
