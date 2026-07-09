package homeworks.work8triangle;

public class Triangle {

    public static void main(String[] args) {

        System.out.println("Triangle Area is: " + calculateTriangleAreaWithThreeSides(2, 10, 6));
    }

    public static double calculateTriangleAreaWithThreeSides(double a, double b, double c) {
        // To avoid "Triangle Area is: NaN"
        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Invalid Triangle!");
            return 0;
        }

        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
