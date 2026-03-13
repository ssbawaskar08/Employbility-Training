import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int n = sc.nextInt();
        int r2 = sc.nextInt();
        int total = sc.nextInt();
        total = total%60 == 0 ? total/60 : total/60 + 1;
        if(n<total){
            System.out.println(r1*n+r2*(total-n));
        }else{
            System.out.println(r1*total);
        }
        sc.close();
    }
}
