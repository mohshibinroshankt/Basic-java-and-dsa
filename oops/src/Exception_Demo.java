public class Exception_Demo {
    public static void main(String[] args) {
        int[] empNo = new int[5];

        try {

            empNo[0] = 10011;
            empNo[6] = 10 / 0;
//            empNo[0] = 10011;
//            empNo[6] = 10022;
            System.out.println(empNo[0]);
            System.out.println(empNo[6]);

//            } catch (ArrayIndexOutOfBoundsException e) {
//                System.out.println(e);
//            }
        }catch(Exception e){
            System.out.println(e);
        }

        System.out.println("After Expression");
        System.out.println("End of the program");

    }
}
