import java.util.Arrays;
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[sc.nextInt()];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Math.max(arr[0]*arr[1]*arr[arr.length-1], arr[arr.length-3]*arr[arr.length-2]*arr[arr.length-1]));
        sc.close();
    }
}
