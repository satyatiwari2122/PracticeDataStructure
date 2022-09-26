class Stack{

}

import java.util.Scanner;

public class StackCreationUsingLinkedList {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Scanner sc = new Scanner(System.in);
        int l;
        do {
            System.out.println("Enter 1 to push 2 to pop 3 to display:");
            System.out.println("Enter your choice : ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    stack.push(sc);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.display();
                    break;
                default:
                    System.out.println("No Case matched");
            }
            System.out.println("Enter 0 to go to main menu : ");
            l = sc.nextInt();
        } while (l == 0);
    }
}
