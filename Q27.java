import java.util.Scanner;

public class Q27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr [] = {5,2,4,6,3,1};
        int k = 2;
        int max = 0,cs=0;
        for(int i=0;i<k;i++){
            max+=arr[i];
            cs +=arr[i];
        }
        for(int i=1;i<arr.length-1;i++){
            cs = cs-arr[i-1]+arr[k+i-1];
            max = Math.max(max, cs);
        }
        System.out.println(max);
    }
}
