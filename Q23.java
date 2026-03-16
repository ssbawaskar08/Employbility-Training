import java.util.Scanner;
public class Q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10,k=5;
        int in = sc.nextInt();
        if(in<=k && in>0 ){
            System.out.println("NUMBER OF CANDIES SOLD : "+in);
            System.out.println("NUMBER OF CANDIES AVAILABLE: "+(n-in));
            n+=in;
        }else{
            System.out.println("INVALID INPUT");
            System.out.println("NUMBER OF CANDIES LEFT: "+(n));
        }
        sc.close();
    }
}
