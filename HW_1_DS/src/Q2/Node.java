package Q2;

public class Node {
    public String name;
    public Score score;
    public Node next, previous;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Node(String name, Score score, Node previous, Node next) {
        this.name = name;
        this.score = score;
        this.next = next;
        this.previous = previous;
    }

    public Score getScore() {
        return score;
    }

    public Node getPrevious() {
        return previous;
    }

    public Node getNext() {
        return next;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}