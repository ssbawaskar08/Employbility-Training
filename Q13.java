import java.util.Scanner;
public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for(int i = 0; i<m;i++){
            for(int j = 0;j<n;j++){
                if(i==0 || j==0){
                    arr[i][j]=1;
                    System.out.print(arr[i][j]+" ");
                }else{
                    arr[i][j]=arr[i][j-1]+arr[i-1][j];
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
        System.out.println(arr[m-1][n-1]);

    }
}
