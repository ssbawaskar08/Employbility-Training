import java.util.Scanner;

public class Q24 {

    static int top;
    static int a[];

    public Q24(int size) {
        a = new int[size];
        top = -1;
    }

    public static int pop() {
        if (top == -1) {
            System.out.println("UNDERFLOW");
            return -1;
        }
        int n = a[top];
        top--;
        return n;
    }

    public static int push(int x) {
        if (top == a.length - 1) {
            System.out.println("OVERFLOW");
            return -1;
        }
        top++;
        a[top] = x;
        return a[top];
    }

    public int peek() {
        if (top == -1) {
            System.out.println("UNDERFLOW");
            return -1;
        }
        return a[top];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter stack size:");
        Q24 obj = new Q24(sc.nextInt());
        sc.nextLine(); // consume newline

        System.out.println("Enter postfix expression:");
        String b = sc.nextLine();

        for (char c : b.toCharArray()) {

            if (Character.isDigit(c)) {
                push(c - '0');
            }

            else if ("+-*/".contains(String.valueOf(c))) {

                int b2 = pop();
                int a2 = pop();

                int result = 0;

                switch (c) {
                    case '+':
                        result = a2 + b2;
                        break;

                    case '-':
                        result = a2 - b2;
                        break;

                    case '*':
                        result = a2 * b2;
                        break;

                    case '/':
                        result = a2 / b2;
                        break;
                }

                push(result);
            }
        }

        System.out.println("Result = " + pop());
    }
}