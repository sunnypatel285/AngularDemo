
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sunnyp
 */
public class LinkListDemo {
    private Node head;
    private int listCount;
    public LinkListDemo(){
        head = new Node(null);
        listCount = 0;
    }
    
    public void add(Object o){
        Node tmp = new Node(o);
        Node current = head;
        while(current.getNext() != null){
            current = current.getNext();
        }
        current.setNext(tmp);
        listCount++;
    }
    
    public Object get(int index){
        if(index > size()){
            return null;
        }
        Node current = head;
        for(int i=1;i<=index;i++){
            current = current.getNext();
        }
        return current.getData();
    }
    
    public boolean remove(int index){
        if(index < 1 || index > size()){
            return false;
        }
        Node current = head;
        for(int i=1;i<index;i++){
            if(current.getNext() == null){
                return false;
            }
            current = current.getNext();
        }
        current.setNext(current.getNext().getNext());
        listCount--;
        return true;
    }
    
    public int size(){
        return listCount;
    }
}

class TestApp{
    public static int sum(int num){
        int sum=0;
        num = num/10;
        if(num == 0){
            return sum;
        }
        sum = sum + (num%10);
        return sum;
    }
    
    public static void main(String[] args){
        System.out.println(sum(123));
        System.out.println("abcd".substring(1));
        LinkListDemo ld = new LinkListDemo();
        ld.add(2);
        ld.add(8);
        ld.add('A');
        ld.add(8.8);
        ld.add(99);
        ld.add("Sunny");
        System.out.println(ld.size());
        System.out.println(ld.get(3));
        ld.remove(3);
        System.out.println(ld.size());
        System.out.println(ld.get(3));
    }
}

class Node{
    Node next;
    Object data;

    public Node(Object data) {
        this.next = null;
        this.data = data;
    }

    public Node(Node head, Object data) {
        this.next = head;
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node head) {
        this.next = head;
    }
}
