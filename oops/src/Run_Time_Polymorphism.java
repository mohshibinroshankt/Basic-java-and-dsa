class Animal{
    void makeSound(){
        System.out.println("Animals Make sound");
    }
}
class Dog extends Animal{
    void makeSound(){
        super.makeSound();//if this is not added, it will be pure runtime polym,dont call the parent
        System.out.println("Dogs Make sound");
    }
}
public class Run_Time_Polymorphism {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.makeSound();
    }
}
