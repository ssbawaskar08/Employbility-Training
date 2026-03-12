import java.util.Scanner;
public class Q8 {
    public static int isPalindrome(char inputStr[],int length){
        int j = length - 1;
        int i = 0;
        while (i<=j) {
            if(inputStr[i]!=inputStr[j]){
                return 0;
            }
            i++;
            j--;
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        // isPalindrome(s.toCharArray(), s.length());
        System.out.println(isPalindrome(s.toCharArray(), s.length()));   
        sc.close();
    }
}
