package com.datastructure.linkedList;

import java.util.Scanner;

public class LinkedListInsertion {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head=null;
    public void insertion(){
        int data;
        int n;
        int c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the data");
        data = sc.nextInt();
        do {
            Node newNode= new Node(data);
            if (head==null){
                head=newNode;
            }
            else {
                System.out.println("Enter 1 to Insert at start " +
                        " Enter 2 to insert at End " +
                        "Enter 3 to insert at specific position ");
                c = sc.nextInt();
                switch (c){
                    case 1:
                        System.out.println("Please Enter the data");
                        data = sc.nextInt();
                        newNode= new Node(data);
                        newNode.next=head;
                        head=newNode;
                        break;
                    case 2:
                        System.out.println("Please Enter the data");
                        data = sc.nextInt();
                        newNode= new Node(data);
                        Node temp =head;
                        while (temp.next!=null){
                            temp=temp.next;
                        }
                        temp.next=newNode;
                        break;
                    case 3:
                        int position;
                        System.out.println("Enter the position where you want to insert");
                        position=sc.nextInt();
                        System.out.println("Please Enter the data");
                        data = sc.nextInt();
                        newNode= new Node(data);
                        Node temp1 =head;
                        for (int i=0; i<(position-2); i++){
                            temp1=temp1.next;
                        }
                        newNode.next=temp1.next;
                        temp1.next=newNode;
                        break;
                    default:
                        System.out.println("No case matched");
                }
            }
            System.out.println("Enter 1 if you want to add more");
            n= sc.nextInt();
        }while (n==1);
    }
    public void traversal(){
        //First we need to check linked list is empty or not
        Node temp = head;
        if (head==null){
            System.out.println("Linked list are empty! Please create Linked list");
        }
        // if linked list are not empty
        else {
            while (temp!=null){
                System.out.println(temp.data +" ");
                temp=temp.next;
            }
        }
    }

    public static void main(String[] args) {
        LinkedListInsertion linkedListInsertion = new LinkedListInsertion();
        linkedListInsertion.insertion();
        linkedListInsertion.traversal();
    }
}
