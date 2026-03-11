import java.util.Scanner;
class Q1 {
    static int factorial(int a){
        if (a == 1){
            return 1;
        }
        return a * factorial(a-1);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter you number");
        int n = sc.nextInt();
        int sum = 0;
        int x = n;
        while ( x > 0){
            sum += factorial(x%10);
            x= x/10;
        }
        if(sum == n){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}