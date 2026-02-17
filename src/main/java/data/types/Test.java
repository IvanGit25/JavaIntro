package data.types;

public class Test {

    public static void main(String[] args) {
        Variable var1 = new Variable(); // we do not need an object to access static variable
        Variable var2 = new Variable();
        Variable.salary = 45; // access static variable directly from class

        System.out.println(Variable.salary); // Correct way of static variable !!!!!
        System.out.println(var1.salary); // Not correct !!!
        System.out.println(var2.salary); // Not correct - same value since salary is static !!!

        // String actions example

        String hello = "Hello World";

        System.out.println(hello.charAt(0));
        System.out.println(hello.length());
        System.out.println(hello.charAt(hello.length() - 1)); // last index of string, because starts from 0 always !!!



    }
}
