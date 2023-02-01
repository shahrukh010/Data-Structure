package com.code.main.list;

public class LinkedList{

    public class Node{

        private int data;//can be access from parent class class also.ie LinkedList 
        private Node next;

        public Node(){}
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

public Node rotateClockWise(Node node,int k){

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

    public Node rotateAntiClock(Node node, int k){

        if(node == null || k < 0)
            return node;

        Node tmp = node;
        k = k % getSizeOfList(node);//because of cicularly we want rotate or (simple if k is greater then size of node)
        for(int index = 1; index < k; index++){

            tmp = tmp.next;
        }
        Node current = tmp.next;
//        System.out.println(current.data);
        tmp.next = null;
        Node res = current;
        while(current.next !=null)current = current.next;
        current.next =node; 
        return res;
    }

    public Node reverseRecursive(Node node){

        if(node == null || node.next  == null)
            return node;
        
        Node tmp = reverseRecursive(node.next);
        node.next.next = node;
        node.next = null;
        return tmp;
    }

    public Node middleNode(Node node){

        if(node == null || node.next !=null)return node;

        Node a = node;
        Node b = node.next;

        while(a !=null && b.next !=null){

            a = a.next;
            b = b.next;
        }
        return a;
    }

    private Node merge(Node a, Node b){

        Node temp = new Node();
        Node finalList = temp;

        while(a != null && b !=null){

            if(a.data < b.data){

                temp.next = a;
                a = a.next;
            }
            else{
                temp.next = b;
                b = b.next;
            }
            temp = temp.next;
        }
        temp.next = (a == null) ? b:a;
        return finalList.next;
    }

    public Node mergeSort(Node node){

        if(node == null || node.next == null)return node;

        Node middle = middleNode(node);
        Node secondHalf = middle.next;
        middle.next = null;
        return merge(mergeSort(node),mergeSort(secondHalf));
    }

    public Node mergeList(Node a , Node b){

        return merge(mergeSort(a),mergeSort(b));
    }

    public Node mergeTwoSortedList(Node a, Node b){

        return merge(a,b);
    }

    public void printNode(){

        Node current = this.first;
        while(current !=null){

            System.out.println(current.data);
            current = current.next;
        }
    }


}
