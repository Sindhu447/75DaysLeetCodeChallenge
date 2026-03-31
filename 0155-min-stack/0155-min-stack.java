import java.util.Stack;

// MinStack class
class MinStack {

    // Main stack to store all elements
    Stack<Integer> stack;

    // Min stack to store minimum elements
    Stack<Integer> minStack;

    // Constructor
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    // Push operation
    public void push(int x) {
        stack.push(x);

        // If minStack is empty OR new value is smaller
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    // Pop operation
    public void pop() {
        // Check if top of both stacks is same
        if (stack.peek().equals(minStack.peek())) {
            minStack.pop();
        }
        stack.pop();
    }

    // Top operation
    public int top() {
        return stack.peek();
    }

    // Get minimum element
    public int getMin() {
        return minStack.peek();
    }
}

// Main class to test
public class Main {
    public static void main(String[] args) {

        MinStack st = new MinStack();

        // Push elements
        st.push(5);
        st.push(3);
        st.push(7);
        st.push(2);

        System.out.println("Current Minimum: " + st.getMin()); // 2

        // Pop element
        st.pop();

        System.out.println("Minimum after pop: " + st.getMin()); // 3

        System.out.println("Top element: " + st.top()); // 7
    }
}