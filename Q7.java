import java.util.*;
public class Q7 {
    public static int magic(int x, int n){
        int sum = 0;
        if (x == 0){
            return 0;
        }
        int i = 1;
        while (x !=0){
            sum+=(x%10+n)%10 * i;
            x = x/10;
            i=i*10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println(magic(sc.nextInt(),sc.nextInt()));
        System.out.println(69%3);
        sc.close();
    }
}
