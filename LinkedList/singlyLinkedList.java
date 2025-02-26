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

    public void display(Node head){
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

    /* Delete first node of a Linked List */
    public Node deleteFirst(){
        if(head == null){
            return null;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    /* Delete last node of a Linked List */
    public Node deleteLast(){
        if(head == null || head.next == null){
            return null;
        }else{
            Node current = head;
            Node previous = null;
            while(current.next != null){
                previous = current;
                current = current.next;
            }
            previous.next = null;
            return current;
        }
    }

    /* Delete a Node in a Linked List at any position */
    public void deleteAt(int position){
        if(position == 1){
            head = head.next;
        }else{
            Node previous = head;
            int count = 1;
            while(count<position-1){
                previous = previous.next;
                count++;
            }
            Node current = previous.next;
            previous.next = current.next;
        }
    }

    /* How to search an element in a Linked List in Java */
    public boolean searchElement(int searchKey){
        if(head == null){
            return false;
        }
        Node current = head;
        while(current!=null){
            if(current.data == searchKey){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    /* How to reverse a singly linked list */
    public Node reverseList(Node head){
        if(head == null){
            return head;
        }
        Node current = head;
        Node next = null;
        Node previous = null;

        while(current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    /* How to find nth Node from the end of Linked List */
    public Node getNthNodeFromEnd(Node head, int position){
        if(head==null){
            return null;
        }
        if(position<=0){
            throw new IllegalArgumentException("invalid value in position = "+position);
        }
        Node mainPtr=head;
        Node refPtr=head;
        int count=0;
        while(count<position){
            if(refPtr==null){
                throw new IllegalArgumentException(position + " value is greater than the number of nodes");
            }
            refPtr=refPtr.next;
            count++;
        }
        while(refPtr!=null){
            refPtr=refPtr.next;
            mainPtr=mainPtr.next;
        }
        return mainPtr;
    }

    /*remove duplicates from a sorted linked list */
    public Node removeDuplicates(Node head){
        if(head==null){
            return null;
        }
        Node current=head;
        while(current!=null && current.next!=null){
            if(current.data==current.next.data){
                current.next=current.next.next;
                current=current.next;
            }
            else{
                current=current.next;
            }
        }
        return head;
    }

    /*insert a node in a sorted singly linked list */
    public Node insertInSortedList(Node head,int value){
        Node newNode=new Node(value);
        if(head==null){
            return newNode;
        }
        Node current=head;
        Node temp=null;
        while(current!=null && current.data<newNode.data){
            temp=current;
            current=current.next;
        }
        newNode.next=current;
        temp.next=newNode;
        return head;
    }

    /*remove given key from singly linked list*/
    public void deleteNode(Node head, int key){
        Node current=head;
        Node temp=null;
        if(current!=null && current.data==key){
            head=current.next;
            return;
        }

        while(current!=null && current.data!=key){
            temp=current;
            current=current.next;
        }
        if(current==null){
            return;
        }
        temp.next=current.next;
    }

    public static void main(String[] args) {
        singlyLinkedList sll = new singlyLinkedList();
        // sll.head = new Node(10);
        // Node second = new Node(5);
        // Node third= new Node(1);
        // sll.head.next = second;
        // second.next = third;
        // third.next = null;
        // sll.display();
        // System.out.println("Lenght is: "+sll.length()) ;
        // //Node insertFirst = new Node(2);
        // sll.insertFirst(2);
        // sll.display();
        // System.out.println("Lenght is: "+sll.length()) ;
        // sll.insertEnd(20);
        // sll.display();
        // System.out.println("Lenght is: "+sll.length()) ;
        // sll.insertAt(35, 3);
        // sll.display();
        // sll.insertAt(9, 1);
        // sll.display();
        // System.out.println("Deleted First Node: "+sll.deleteFirst().data);
        // sll.display();
        // System.out.println("Deleted Last Node: "+sll.deleteLast().data);
        // sll.display();
        // sll.deleteAt(3);
        // sll.display();
        // System.out.println(sll.searchElement(7));
        Node head = new Node(2);
        Node second = new Node(4);
        Node third = new Node(4);
        Node fourth = new Node(11);

        head.next = second;
        second.next = third;
        third.next = fourth;
        sll.display(head);
        //Node reversed = sll.reverseList(head);
        //sll.display(reversed);
        // Node nthData = sll.getNthNodeFromEnd(head, 3);
        // System.out.println("The data at nth position is: "+nthData.data);
        // Node ivaln= sll.getNthNodeFromEnd(head, 0);
        // System.out.println("The data at nth position is: "+ivaln.data);
        // Node greatern= sll.getNthNodeFromEnd(head, 23);
        // System.out.println("The data at nth position is: "+greatern.data);

        // Node noDuplicates=sll.removeDuplicates(head);
        // sll.display(noDuplicates);

        // Node insertInSorted=sll.insertInSortedList(head,3);
        // sll.display(insertInSorted);

        sll.deleteNode(head,4);
        sll.display(head);
    }
}