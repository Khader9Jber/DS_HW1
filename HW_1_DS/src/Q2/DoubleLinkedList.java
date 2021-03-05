package Q2;

public class DoubleLinkedList {

    private Node first, last;
    private int size = 0;

    public DoubleLinkedList() {
        first = new Node(null, null, null, null);
        last = new Node(null, null, first, null);
        first.setNext(last);
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void removeLast() {
        if (!isEmpty()) remove(last.getPrevious());
    }

    private void remove(Node node) {
        Node predecessor = node.getPrevious();
        Node successor = node.getNext();
        predecessor.setNext(successor);
        successor.setPrevious(predecessor);
        size--;
    }

    private void addBetween(String name, Score score, Node predecessor, Node successor) {
        Node newest = new Node(name, score, predecessor, successor);
        predecessor.setNext(newest);
        successor.setPrevious(newest);
        size++;
    }

    public void addFirst(String name, Score score) {
        addBetween(name, score, first, first.getNext());
    }

    public void addLast(String name, Score score) {
        addBetween(name, score, last.getPrevious(), last);
    }

    public void addNode(String name, Score score) {
        if (isEmpty()) {
            addFirst(name, score);
            return;
        }
        if (score.getScore() > 50) {
            Node current = first.getNext();
            if (current.getScore().getScore() <= score.getScore()) {
                addFirst(name, score);
                if (size() > 10) removeLast();
            } else {
                while (current.getNext() != last && score.getScore() <= current.getNext().getScore().getScore()) {
                    current = current.getNext();
                }
                if (current.getNext() == last) {
                    if (size() < 10) {
                        addLast(name, score);
                    }
                } else {
                    addBetween(name, score, current, current.getNext());
                    if (size() > 10) removeLast();
                }
            }
        } else {
            Node current = last.getPrevious();
            if (current.getScore().getScore() >= score.getScore()) {
                if (size() < 10) addLast(name, score);
            } else {
                while (current.getPrevious() != first && score.getScore() >= current.getPrevious().getScore().getScore()) {
                    current = current.getPrevious();
                }
                if (current.getPrevious() == first) {
                    addFirst(name, score);
                    if (size() > 10) removeLast();
                } else {
                    addBetween(name, score, current.getPrevious(), current);
                    if (size() > 10) removeLast();
                }
            }
        }
    }

    public void printAll() {
        Node current = first.getNext();
        int count = 1;
        while (current != last) {
            System.out.println(current.getName() + " >>> " + current.score.getScore());
            current = current.next;
            count++;
        }
    }


}