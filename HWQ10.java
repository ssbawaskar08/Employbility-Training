import java.util.Scanner;

public class HWQ10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double d = b*b - 4*a*c;

        if (d >= 0) {
            double r1 = (-b + Math.sqrt(d)) / (2*a);
            double r2 = (-b - Math.sqrt(d)) / (2*a);
            System.out.println(r1 + " " + r2);
        } else {
            System.out.println("No real roots");
        }
    }
}
