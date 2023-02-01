package com.code.main.list;

public class LinkedList{

    public class Node{

        private int data;//can be access from parent class class also.ie LinkedList 
        private Node next;

        public Node(int data){
            this.data = data;
        }

        public int getData(){
            return this.data;
        }

        public Node getNext(){
            return this.next;
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

    private int getSizeOfList(Node node){

        if(node ==null)
            return 0;

        return getSizeOfList(node.next)+1;
    }
    public int getSizeOfList(){

        return getSizeOfList(this.first);
    }

    public void reverse(){

        Node r = null;
        Node q = null;
        Node p = this.first;

        while(p !=null){

            r = q;
            q = p;
            p = p.next;
            q.next = r;
        }
        this.first = q;
    }

    public Node getNode(){

        return this.first;
    }


    public Node rotateAntiClock(Node node,int k){

        int size = getSizeOfList(node);
        Node lastNode = node;
        Node current  = null;

        for(int index = 1; index < size - k;index++){
            lastNode = lastNode.next;
        }
        current = lastNode.next;
//        System.out.println(current.data);//8
        lastNode.next = null;
        Node res = current;

        while(current.next !=null)current = current.next;
        current.next = node;
        return res;
    }

    public void printNode(){

        Node current = this.first;
        while(current !=null){

            System.out.println(current.data);
            current = current.next;
        }
    }


}
