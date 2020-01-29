import java.util.Stack;

public class TestSteck {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(6);
        stack.push(3);
        stack.push(1);

        while (!stack.isEmpty())
            System.out.println(stack.pop());



    }
}
