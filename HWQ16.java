import java.util.Stack;

public class HWQ16 {
        public static void main(String[] args) {
        String s = "abbaca";

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == ch)
                stack.pop();
            else
                stack.push(ch);
        }

        StringBuilder result = new StringBuilder();
        for (char ch : stack)
            result.append(ch);

        System.out.println(result.toString());
    }
}
