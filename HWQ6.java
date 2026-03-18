public class HWQ6 {
    public static void main(String[] args) {
        int temp = 0;
        int num1 = 10;
        int num2 = 25;
        System.out.println("Number 1:"+num1+" Number 2:"+num2);
        temp = num2;
        num2=num1;
        num1 = temp;
        System.out.println("Number 1:"+num1+" Number 2:"+num2);
    }
}
