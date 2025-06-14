interface Payment{
    void processPayment();
}

class CreditCard implements Payment{
    public void processPayment(){
        System.out.println("Processing for CreditCard Payment");
    }
}

class UpiPayment implements Payment{
    public void processPayment(){
        System.out.println("Processing for UpiPayment Payment");
    }
}

public class interface_demo {
    public static void main(String[] args) {
        Payment pay = new CreditCard();
        pay.processPayment();
        UpiPayment upi = new UpiPayment();
        upi.processPayment();
    }
}
