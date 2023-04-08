import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int command = 0;
        Stack stack = new Stack();

        printMenu();

        while (command != 6) {
            System.out.print("Please enter your command: ");
            command = input.nextInt();
            System.out.println();

            switch (command) {
                case 1 -> push();
                case 2 -> pop();
                case 3 -> peek();
                
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

    public static void push() {
        
    }

    public static void pop() {
        
    }

    public static void peek() {
        
    }
}