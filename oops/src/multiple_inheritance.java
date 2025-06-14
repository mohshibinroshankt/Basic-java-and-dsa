interface Backend{
    default void work()
    {
        System.out.println("working on backend");
    }
}

interface Frontend{
    default void work(){
        System.out.println("working on frontend");
    }
}

class FullStackDeveloper implements Frontend,Backend{
    public void work(){
        System.out.println("working on full stack developer");
        Backend.super.work();
        Frontend.super.work();
    }
}
public class multiple_inheritance {
    public static void main(String[] args) {
        FullStackDeveloper f = new FullStackDeveloper();
        f.work();

    }

}
