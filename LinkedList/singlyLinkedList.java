package LinkedList;
public class singlyLinkedList{
    private Node head;
    private static class Node{
        private int data;
        private Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void display(){
        Node current = head;
        while(current!=null){
            System.out.print(current.data+" -> ");
            current = current.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        singlyLinkedList sll = new singlyLinkedList();
        sll.head = new Node(10);
        Node second = new Node(5);
        Node third= new Node(1);
        sll.head.next = second;
        second.next = third;
        third.next = null;
        sll.display();
    }
}