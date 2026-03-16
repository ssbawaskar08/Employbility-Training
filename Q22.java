// p1 employed who solved the first, second problem
import java.util.Scanner;
public class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p1=sc.nextInt(),p2=sc.nextInt(),p3=sc.nextInt(),q=sc.nextInt(),e=sc.nextInt(),r=sc.nextInt();
        //a intersection B intersection C = Q;
        //U-solved =r;
        System.out.println((((e-r)-p1-p2-p3+2*q)/3)+p3+p1-q);
        System.out.println((e-r)-p1-p2-p3+2*q);
    }
}
//30 26 28 14 345 43 ---> 126 246
