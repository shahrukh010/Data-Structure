package com.code.main.list;

public class LinkedList{

    class Node{

        private int data;//can be access from parent class class also.ie LinkedList 
        private Node next;

        public Node(int data){
            this.data = data;
        }

    }

    private Node first = null;
    private Node last  = null;

    public void add(int value){

        Node newNode = new Node(value);

        if(this.first == null){
            this.first = newNode;
            this.last  = newNode;
        }
        else{

            this.last.next = newNode;
            this.last = newNode;
        }
    }

    public void printNode(){

        Node current = this.first;
        while(current !=null){

            System.out.println(current.data);
            current = current.next;
        }
    }


}
