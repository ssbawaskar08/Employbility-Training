import java.util.Scanner;
public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int r = sc.nextInt();
        int[] acn = new int[n];
        int [] acm = new int[m];
        int inc = 0,out=0;
        for(int i = 0;i<n;i++){
            acn[i]=sc.nextInt()-r;
            inc+=acn[i];
        }
        for(int i = 0;i<m;i++){
            acm[i]=sc.nextInt()-r;
            out+=acm[i];
        }
        if(inc>out){
            System.out.println(Math.abs(out-inc-2)*-1);
        }else if (inc<out){
            System.out.println(out-inc+2);
        }else if(inc==out){
            System.out.println("BALANCED");
        }
        
    }
}
