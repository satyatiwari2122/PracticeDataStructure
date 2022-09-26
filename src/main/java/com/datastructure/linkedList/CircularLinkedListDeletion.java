package com.datastructure.linkedList;

import java.io.PrintStream;
import java.util.Scanner;

public class LinkedListDeletion {
    private PrintStream out;

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    public void insertion() {
        int data;
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Please Enter the data");
            data = sc.nextInt();
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode; // This will add node at starting
            }
            else {
                newNode.next=head;
                head = newNode;
            }
            System.out.println("Enter 1 if you want to add more");
            n = sc.nextInt();
        } while (n == 1);
    }
    public void deletion(){
        Scanner sc= new Scanner(System.in);
        Node temp=null;
        Node ptr =null;
        if (head==null){
            System.out.println("Linked list is empty");
        }else
        {
            System.out.println("Enter 1 to delete at start " +
                    " Enter 2 to delete at End " +
                    "Enter 3 to delete at specific position ");
        }
        int c= sc.nextInt();
        switch (c){
            case 1:
                temp=head;
                temp =temp.next;
                head = temp;
                break;
            case 2:
                 temp =head;
                 ptr=temp.next;
                while (ptr.next!=null){
                    temp=ptr;
                    ptr=ptr.next;
                }
                temp.next=null;
                break;
            case 3:
                int position;
                System.out.println("Enter the position where you want to delete");
                position=sc.nextInt();
                temp=head;
                ptr=temp.next;
                for (int i=0;i<position-2; i++){
                    temp=ptr;
                    ptr =ptr.next;
                }
                temp.next=ptr.next;
                break;
            default:
                System.out.println("No case matched");
        }
    }

    public void traversal() {
        //First we need to check linked list is empty or not
        Node temp = head;
        if (head == null) {
            System.out.println("Linked list are empty! Please create Linked list");
        }
        // if linked list are not empty
        else {
            while (temp != null) {
                System.out.println(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        LinkedListDeletion linkedListInsertion = new LinkedListDeletion();
        linkedListInsertion.insertion();
        linkedListInsertion.deletion();
        linkedListInsertion.traversal();
    }
}
