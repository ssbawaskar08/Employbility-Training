import java.util.Scanner;
public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(),n=sc.nextInt();
        int [] max = new int[m];
        for(int i =0 ;i<m;i++){
            for(int j = 0;j<n;j++){
                int x = sc.nextInt();
                if(x>max[i]){
                    max[i]=x;
                }
            }
        }
        for(int i = 0;i<max.length;i++){
            System.out.print(max[i]+" ");
        }
    }
}
