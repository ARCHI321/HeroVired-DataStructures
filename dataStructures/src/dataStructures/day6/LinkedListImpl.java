package dataStructures.day6;

class Node{
    public Object item;
    public Node next;

}
public class LinkedListImpl {
    public Node head;
    public Node tail;
    public int size;
    public LinkedListImpl(){
       this.head = null;
       this.size = 0;
    }
    public void printList(Node head){
        System.out.println("Printing the linked list :");
        Node current = this.head;
        while(current.next != null){
            System.out.print(current.item+"->");
            current=current.next;
        }
        System.out.println(current.item);
    }
    public void insertionAtEnd(String value){
        Node newNode = new Node();
        newNode.item = value;

        Node current = this.head;
        if(this.head == null){
            this.head = newNode;
            this.head.next = null;
            this.size =1;
        }
        else{
            while(current.next != null){
                current=current.next;
            }
            tail = current;
            tail.next = newNode;
            tail=newNode;
            tail.next=null;
            this.size =this.size+1;
        }
        printList(this.head);

    }
    public void insertAtBeginning(String value){
        Node newNode = new Node();
        newNode.item = value;

        newNode.next = head;
        this.head = newNode;
        printList(this.head);
        this.size =this.size+1;
    }
    public void insertAtPosition(String value,int pos){
        Node newNode = new Node();
        newNode.item = value;
        Node current = this.head;
        int fpos=0;
        while(current.next != null) {
            fpos++;
            if (fpos == pos) {
                break;
            }
            current = current.next;
        }
        newNode.next = current.next;
        current.next=newNode;
        this.size =this.size+1;
        printList(this.head);
    }

    public void reverseList(){
        Node prev = null;
        Node current = head;
        while(current != null){
            head = current.next;
            current.next = prev;
            prev = current;
            current=head;
        }
        head = prev;
        printList(this.head);
    }

    public void deleteAtBeginning(){
        Node temp = this.head;
        head = head.next;
        this.size-=1;
        printList(this.head);
    }
    public void deleteAtEnd(){
        Node temp = this.head;
        while(temp.next.next!=null){
            temp = temp.next;
        }
        tail = temp;
        tail.next = null;
        this.size-=1;
        printList(this.head);

    }

    public void deleteAtPos(int pos){
        if(this.head != null && pos>0 && pos<=this.size){
            Node temp = this.head;
            Node prev = null;
            for(int i=1;i<=pos;i++){
                prev = temp;
                temp=temp.next;
            }
            prev.next = temp.next;
            this.size-=1;
            printList(this.head);
        }
        else{
            System.out.println("Not a correct position.");
        }
    }

    public static void main(String[] args) {
        LinkedListImpl obj = new LinkedListImpl();
        obj.insertionAtEnd("Archi");
        obj.insertionAtEnd("Upa");
        obj.insertAtBeginning("Ritwik");
        obj.insertionAtEnd("Rishav");
        obj.insertAtPosition("Sangbaran",2);
        obj.reverseList();
        obj.deleteAtBeginning();
        obj.deleteAtEnd();
        obj.insertionAtEnd("Rishav");
        obj.insertAtBeginning("Ritwik");
        obj.deleteAtPos(2);
    }
}
