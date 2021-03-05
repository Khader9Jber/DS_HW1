package Q3;
public class Main {
    public static void main(String[] args) {
        Stack<String> s = new Stack<>(3);
        s.push("a");
        s.push("b");
        s.push("c");
        Stack<String> t = new Stack<>(3);
        Stack<String> returned = transfer(s, t);
        System.out.println(returned.top());
    }

    public static Stack<String> transfer(Stack<String> s, Stack<String> t) {
        while (!s.isEmpty() && !t.isFull()) {
            t.push(s.pop());
        }
        return t;
    }
}
