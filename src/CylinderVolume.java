import java.util.Scanner;

public class CylinderVolume {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius of cylinder: ");
        double r = scanner.nextDouble();

        System.out.print("Enter height of cylinder: ");
        double h = scanner.nextDouble();

        double base = r * r * Math.PI;
        double A = base * 2 + h * 2 * Math.PI * r;
        double V = base * h;

        System.out.printf("The area of the cylinder is %.2f%n", A);
        System.out.printf("The volume of the cylinder is %.2f%n", V);

    }

}
