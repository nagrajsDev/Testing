package JavaTechnicalInteviewPrograms;

public class Stack {
    private int[] arr;
    private int top;
    private int size;

    public Stack(int size) {
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    public void push(int element) {
        if (isFull()) {
            throw new IllegalStateException("Stack is full");
        }
        top++;
        arr[top] = element;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        int element = arr[top];
        top--;
        return element;
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop()); // Output: 3
        System.out.println(stack.peek()); // Output: 2
        stack.push(4);
        stack.push(5);
        System.out.println(stack.isFull()); // Output: true
    }
}

