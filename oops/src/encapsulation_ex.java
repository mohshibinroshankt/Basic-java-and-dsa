class Personal_Data{
    private int pan_number;
    private String pan_name;
    private String pan_address;
    private double salary;


    public int getPan_number() {
        return pan_number;
    }

    public void setPan_number(int pan_number) {
        this.pan_number = pan_number;
    }

    public String getPan_name() {
        return pan_name;
    }

    public void setPan_name(String pan_name) {
        this.pan_name = pan_name;
    }

    public String getPan_address() {
        return pan_address;
    }

    public void setPan_address(String pan_address) {
        this.pan_address = pan_address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


}


public class encapsulation_ex {
    public static void main(String[] args) {
        Personal_Data pd = new Personal_Data();
        pd.setPan_number(10);
        pd.setPan_name("James");
        pd.setPan_address("123 Main St");
        pd.setSalary(500.00);
        System.out.println(pd.getPan_number());
        System.out.println(pd.getPan_name());
        System.out.println(pd.getPan_address());
        System.out.println(pd.getSalary());

    }
}
