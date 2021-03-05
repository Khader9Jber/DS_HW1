package Q1;

import java.util.Scanner;

class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        singlyLinkedList players = new singlyLinkedList();
        while (true) {
            System.out.println("Enter the Name: OR -1 to terminate");
            String name = in.nextLine();
            if (name.equals("-1"))
                break;
            System.out.println("Enter the Score:");
            String score = in.nextLine();
            Score s = new Score(Integer.parseInt(score));
            Node node = new Node(name, s);
            players.insertNode(node);
        }
        System.out.println("\nThe Highest 10 scores are:");
        players.printAll();
    }
}