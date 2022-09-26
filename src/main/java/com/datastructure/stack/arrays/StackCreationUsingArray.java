package com.datastructure.stack;

import java.util.Scanner;

class Stack {
    int top = -1;
    int n = 10;
    int a[] = new int[n];

    public void push(Scanner sc) {
        if (top == (n - 1)) {
            System.out.println("Overflow");
        } else {
            System.out.println("Enter data");
            int data = sc.nextInt();
            top = top + 1;
            a[top] = data;
            System.out.println("Item inserted");
        }
    }

    public void pop() {
        if (top == -1) {
            System.out.println("under flow");
        } else {
            top = top - 1;
            System.out.println("Item deleted");
        }
    }

    public void display() {
        System.out.println("Items are :");
        for (int j = top; j >= 0; j--) {
            System.out.print( a[j] + "\n");
        }
    }
}

public class StackCreationUsingArray {
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
