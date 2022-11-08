package Chap9ImmutableObjects;

public class Main {

    public static void main(String[] args) {

        String s = "hello";
        String t = new String("hello");

        // strings are immutable

        // make a version of s that is capitalized
        String s1 = Character.toUpperCase(s.charAt(0)) + (s.substring(1));

        // StringBuilder - mutable strings

        // Character objects are also immutable

        char ch = 'a';
        Character ch2 = 'z';
        // Character ch3 = new Character('a');  deprecated

        int x = 33;
        // Integer y = new Integer(33);  deprecated

        double pi = 3.14159;
        Double pi1 = 3.14159;
        Boolean flag = false;
        Long ll = 43L;  // L represents long constant
        pi1 = 2.7128;

        // Double, Long, Integer, Boolean, Character are all wrapper classes
        // for their respective primitive type.
        // Taking a primitive value and wrapping it in an object is called autoboxing.
        // Turning an object into its primitive is called auto-unboxing.

        Student student1 = new Student("Logan", "Ritchie", "12345678", "Loges");
        Student student2 = new Student("Philippe", "Chapleau", "22345678", "Chaps");
        // student1.first = "Harry";  error
        // student1.nickname = "Loges";  error

        // toString is implicitly called by println
        System.out.println(student1);
        System.out.println(student2);

    }

}
