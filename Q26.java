import java.util.Scanner;
public class Q26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int arr [] [] = new int[str1.length()+1][str2.length()+1];
        
        for(int i = 1;i<str1.length()+1;i++){
            for (int j = 1;j<str2.length()+1;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    arr[i][j] = arr[i-1][j-1] + 1;
                }else{
                    arr[i][j] = Math.max(arr[i-1][j],arr[i][j-1]);
                }
            }
        }
        for(int i=0;i<str1.length()+1;i++){
            for(int j = 0;j<str2.length()+1;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(arr[str1.length()][str2.length()]);
    }
}
