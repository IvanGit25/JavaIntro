package data.types;

public class Variable {
    // Primitive data types - Stack memory !!!
    static char symbol = '$';

    static byte age = 120;

    static short salary;

    static int egn;

    static long marsPeakHeight;

    static float weight;

    static double bankBalance;

    // Referent data types - Heap memory !!!
    static String testString = "some random text";
    static String text = "My name is <Test>";

    public static void main(String[] args) {
        // local variables
        String someName = "" ;
        Dog bella = new Dog();
        Dog sharo = new Dog();

        // Primitive types
        System.out.println(symbol);
        System.out.println(age);
        System.out.println(salary);
        System.out.println(egn);
        System.out.println(marsPeakHeight);
        System.out.println(weight);
        System.out.println(bankBalance);

        // Referent types
        System.out.println(testString);

        System.out.println(bella);
        bella.age = 10;
        bella.weight = 14;
        bella.name = "Bella";
        bella.isFemale = true;
        bella.isGood = true;

        System.out.println(bella.age);
        System.out.println(bella.name);
        System.out.println(bella.isFemale);
        System.out.println(bella.weight);

        System.out.println("----------");
        bella.printData();
        System.out.println("----------");
        // Printing formatted data :
        bella.printDataFormatted();
        System.out.println("----------");
        sharo.printData();


    }



}
