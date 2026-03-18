import java.util.Scanner;

public class HWQ13 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        int n = sc.nextInt();

        double factor = Math.pow(10, n);
        double result = Math.round(num * factor) / factor;

        System.out.println(result);
    }
}
