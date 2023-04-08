package LinkedLists;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        LinkedList list = new LinkedList();

        printMenu();
        int command = 0;

        while (command != 6) {
            System.out.print("Please enter your command: ");
            command = input.nextInt();
            System.out.println();

            switch (command) {
                case 1 -> add(input, list);
                case 2 -> search(input, list);
                case 3 -> remove(input, list);
                case 4 -> print(list);
                case 5 -> sumNodes(list);
            }
            printMenu();
        }
    }

    public static void printMenu() {
        System.out.println("============================================");
        System.out.println("= 1. Add a number                          =");
        System.out.println("= 2. See if a number is in the list        =");
        System.out.println("= 3. Remove the first instance of a number =");
        System.out.println("= 4. Print all nodes                       =");
        System.out.println("= 5. Sum all nodes                         =");
        System.out.println("= 6. Quit                                  =");
        System.out.println("============================================");
    }

    public static LinkedList add(Scanner input, LinkedList list) {
        System.out.print("What integer would you like to add? ");
        int data = input.nextInt();
        list.add(data);

        return list;
    }

    public static void search(Scanner input, LinkedList list) {
        System.out.print("What value would you like to search for? ");
        int value = input.nextInt();
        int idx = list.search(value);

        if (!list.isEmpty()) {
            if (idx == -1) {
                System.out.println("Value was not found in the list.");
            }
            else {
                System.out.println("Value was found at index " + idx + ".");
            }
        }
    }

    public static LinkedList remove(Scanner input, LinkedList list) {
        System.out.println("What value would you like to remove? ");
        int value = input.nextInt();
        int idx = list.search(value);
    

        if (!list.isEmpty()) {
            if (idx == -1) {
                System.out.println("Error: Value not found.");
            }
            else {
                list.remove(value);
            }
        }
        else {
            System.out.println("Error: List is currently empty.");
        }

        return list;
    }

    public static void print(LinkedList list) {
        if (!list.isEmpty()) {
            list.print();
        }
        else {
            System.out.println("Error: List empty.");
        }
    }

    public static void sumNodes(LinkedList list) {
        

        if (!list.isEmpty()) {
            int value = list.sumNodes(list);
            System.out.println("Sum of all nodes is " + value);
        }
        else {
            System.out.println("Error: List empty.");
        }
    }
}
