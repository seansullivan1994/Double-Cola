package com.CodeWars.Problems;

import java.util.NoSuchElementException;

public class DoubleCola<String>
{
    private static class QueueNode<String>
    {
        private String data;
        private QueueNode<String> next;

        public QueueNode(String data){
            this.data = data;
        }
    }
    private QueueNode<String> first;
    private QueueNode<String> last;
    public void add(String item){
        QueueNode<String> t = new QueueNode<>(item);
        if(last !=null){
            last.next = t;
        }
        last = t;
        if(first == null){
            first = last;
        }
    }
    public String remove(){
        if(first == null) throw new NoSuchElementException();
        String data = first.data;
        first = first.next;
        if(first == null)
        {
            last = null;
        }
        return data;
    }
    public String peek(){
        if(first == null) throw new NoSuchElementException();
        return first.data;
    }
    public boolean isEmpty(){
        return first == null;
    }


}
