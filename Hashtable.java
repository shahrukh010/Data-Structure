package com.code.hashtable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Hashtable {

    private List<LinkedList<Integer>> table;
    int bucket = 0;

    public Hashtable(int size){
        this.bucket = size;

       table = new ArrayList<>();

       for(int index = 0; index < size; index++)
           table.add(new LinkedList<Integer>());
    }

    public void add(int data){

        int index = data % this.bucket;
        table.get(index).add(data);
    }

    public void remove(int data){

        int index = data % bucket;
        table.get(index).remove((Integer)data);//if not do type cast then it will consider as index not object
    }

    List res = null;

    @Override
    public String toString(){

        res = new ArrayList<>();
        for(List list : table){
            res.add(list);
        }
        return res.toString();
    }
}
