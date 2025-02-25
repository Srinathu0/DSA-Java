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
        System.out.println("null");
    }

    public int length(){
        if(head == null){
            return 0;
        }
        Node current = head;
        int count = 0;
        while(current != null){
            count++;
            current = current.next;
        }
        return count;
    }

    /* Insert a Node in the beginning of the Linked List */
    public void insertFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    /* Insert a Node at the end of the Linked List */
    public void insertEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

    /* Insert a Node in a linked list at the given position */
    public void insertAt(int data, int position){
        Node newNode = new Node(data);
        if(position == 1){
            newNode.next = head;
            head = newNode;
        }else{
            Node previous = head;
            int count = 1;
            while(count < position -1){
                previous = previous.next;
                count++;
            }
            Node current = previous.next;
            newNode.next = current;
            previous.next = newNode;
        }
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
        System.out.println("Lenght is: "+sll.length()) ;
        //Node insertFirst = new Node(2);
        sll.insertFirst(2);
        sll.display();
        System.out.println("Lenght is: "+sll.length()) ;
        sll.insertEnd(20);
        sll.display();
        System.out.println("Lenght is: "+sll.length()) ;
        sll.insertAt(35, 3);
        sll.display();
        sll.insertAt(9, 1);
        sll.display();
    }
}