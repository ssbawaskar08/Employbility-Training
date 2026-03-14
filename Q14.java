import java.util.Scanner;
public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] out = new int[sc.nextInt()];
        for(int i =0; i<out.length;i++){
            out[i]=sc.nextInt()*4+sc.nextInt()*2;
        }
        for(int i = 0;i<out.length;i++){
            System.out.println(out[i]);
        }
    }
}