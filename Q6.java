import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int [][] arr = new int[row][col];
        int sum1 =0;
        int sum2 = 0;
        for(int i = 0;i<row;i++){
            for (int j = 0;j<col;j++){
                arr[i][j]=sc.nextInt();
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        for(int i = 0 ;i<col; i++){
            sum1+=arr[i][i];
            sum2 += arr[i][arr.length-1-i];
        }
        System.out.println(Math.abs(sum1-sum2));
    }
}
