import java.util.Scanner;
public class Q18 {
    public static void main(String[] args) {
        int out = 0;
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        for (int i = 1;i<11;i++){
            out+=in*i;
        }
        System.out.println(table(in, 1));
    }
    public static int table(int a,int x){
        return x<=10 ? a * x +(table(a, x+1)):a*x;
    }
    //all the answer are wrong. we have to multiply the input by 55. because in table we can do input*(1+2+3+4+5+6+7+8+9+10)

    // final logic is input * 55;
}
