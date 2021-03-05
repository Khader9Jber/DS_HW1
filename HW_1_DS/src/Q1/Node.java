package Q1;

public class Node {
    String name;
    Score score;
    Node next;

    public Node(String name, Score score) {
        setName(name);
        setScore(score);
    }

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

}