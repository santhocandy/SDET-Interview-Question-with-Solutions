import java.util.Stack;

public class ReverseNumberWithStack {
    public static int reverse(int number) {
        Stack<Integer> stack = new Stack<>();
        while (number > 0) {
            stack.push(number % 10);
            number /= 10;
        }
        int reverse = 0;
        while (!stack.isEmpty()) {
            reverse = reverse * 10 + stack.pop();
        }
        return reverse;
    }

    public static void main(String[] args) {
        int number = 12345;
        System.out.println("Reversed Number: " + reverse(number));
    }
}
