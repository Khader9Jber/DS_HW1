package Q3;
public class Stack<T> {
    private T[] data;
    int top = -1;
    int size = 10;

    public Stack() {
        data = (T[]) new Object[size];
    }

    public Stack(int size) {
        this.size = size;
        data = (T[]) new Object[size];
    }

    public void push(T element) {
        if (isFull()) {
            System.out.println("Full Stack.");
        } else {
            data[++top] = element;
        }
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Empty Stack.");
            return null;
        } else {
            T popped = data[top];
            data[top] = null;
            top--;
            return popped;
        }
    }

    public T top() {
        if (isEmpty()) return null;
        return data[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == data.length - 1;
    }
}
