public class String_demo {
    public static void main(String[] args) {
        char[] helloString = new char[] {'h', 'e', 'l', 'l', 'o'};
        System.out.println(helloString);

        String str = new String(helloString);
        System.out.println(str);

        String str2 = "hello world";
        System.out.println(str2);

        String str3 = new String("hello world");
        System.out.println(str3);

        System.out.println(str3 == str2);
        String str4 = "hello world";
        System.out.println(str4.charAt(0));
        System.out.println(str4.length());
        System.out.println(str4.toUpperCase());
        System.out.println(str4.toLowerCase());
        System.out.println(str3.equals(str2));
        System.out.println(str3.compareTo(str4));
        System.out.println(str3.compareToIgnoreCase(str4));
        System.out.println(str3.hashCode());
//        System.out.println(str2.contains("w"));
//        System.out.println(str4.concat(:"concat testing" ));
    }
}
