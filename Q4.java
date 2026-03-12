// rewrite by putting multipler
import java.util.*;
public class Q4 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N=");
        int[] arr = new int[sc.nextInt()];
        for(int i = 0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        for(int i = 0; i <arr.length;i++){
            if(arr[i]%10!=0){
                System.out.print(arr[i]+" ");
            }
        }
        for (int i = 0;i<arr.length;i++){
            if (arr[i]%10==0) {
                System.out.print(arr[i]+" ");
            }
        }
        sc.close();
    }    
}
