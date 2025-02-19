class Node{
    int data;
    Node next;
    public Node(int Data){
        this.data=Data;
        this.next=null;
    }
}
public class LinkedList {
    Node head;
    static void insertAtBegin(int data){
        Node newNode= new Node(data);
        Node newNode=new Node(data);
        newNode.next = head;
        head=newNode;
    }
}
