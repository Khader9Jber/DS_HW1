package Q2;

import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        DoubleLinkedList players = new DoubleLinkedList();

        while (true){
            System.out.println("Enter Name: -1 to terminate");
            String name = in.nextLine();
            if (name.equals("-1"))
                break;
            System.out.println("Enter the Score:");
            String score = in.nextLine();
            Score s = new Score(Integer.parseInt(score));
            Score sc = new Score(Integer.parseInt(score));
            players.addNode(name, sc);
        }

        System.out.println("The Highest 10 scores are:");
        players.printAll();
    }
}