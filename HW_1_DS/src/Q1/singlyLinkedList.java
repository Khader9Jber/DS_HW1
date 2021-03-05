package Q1;

public class singlyLinkedList {


    private Node first = null;
    private Node last = null;
    int size = 0;

    public void setFirst(Node first) {
        this.first = first;
    }

    public Node getFirst() {
        return first;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    public void insertNode(Node newest) {
        Node current = first;
        if (first == null) {
            first = newest;
            size++;
        } else if (newest.score.getScore() >= current.score.getScore()) {
            first = newest;
            newest.next = current;
            if (countNodes(first) > 10) {
                removeLast();
            }
        } else {
            while (current.next != null && newest.score.getScore() <= current.next.score.getScore()) {
                current = current.next;
            }
            if (current.next == null) {
                if (countNodes(first) < 10) {
                    current.next = newest;
                    size++;
                }
            } else {
                newest.next = current.next;
                current.next = newest;
                size++;
                if (countNodes(first) > 10) {
                    removeLast();
                }
            }
        }
    }

    public void removeLast() {
        Node current = first;
        Node beforeLast = first;
        while (current.next != null) {
            beforeLast = current;
            current = current.next;
        }
        beforeLast.next = null;
        size--;
    }

    public void printAll() {
        Node current = first;
        while (current != null) {
            System.out.println(current.getName() + " >>> " + current.score.getScore());
            current = current.next;
        }
    }

    public int countNodes(Node list) {
        if (list.next == null) {
            return 1;
        } else {
            return countNodes(list.next) + 1;
        }
    }

}
