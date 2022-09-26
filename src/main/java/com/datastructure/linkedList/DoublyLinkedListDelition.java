package com.datastructure.linkedList;

import java.util.Scanner;

public class DoublyLinkedListCreation {
    static class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    Node head = null;
    Node tail = null;
    public void creation(){
        int data, n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Please Enter the data : ");
            data=sc.nextInt();
            Node newNode= new Node(data);
            if (head==null){
                head=newNode;
                tail=newNode;
            }
            else{
                head.prev=newNode; // This will add node at starting
                newNode.next=head;
                head = newNode;
            }
            System.out.println("Do you want to add more node if yes press 1 :");
            n=sc.nextInt();
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
        DoublyLinkedListCreation doublyLinkedListCreation = new DoublyLinkedListCreation();
        doublyLinkedListCreation.creation();
        doublyLinkedListCreation.traversal();
    }
}
