package dataStructures.day5;

class node{
    public Object item;
    public node next;

}
public class LinkedListImpl {
    public node head;
    public node tail;
    public int size;
    public LinkedListImpl(){
       this.head = null;
       this.size = 0;
    }
    public void printList(node head){
        System.out.println("Printing the linked list :");
        node current = this.head;
        while(current.next != null){
            System.out.print(current.item+"->");
            current=current.next;
        }
        System.out.println(current.item);
    }
    public void insertionAtEnd(String value){
        node newnode = new node();
        newnode.item = value;

        node current = this.head;
        if(this.head == null){
            this.head = newnode;
            this.head.next = null;
            this.size =1;
        }
        else{
            while(current.next != null){
                current=current.next;
            }
            tail = current;
            tail.next = newnode;
            tail=newnode;
            tail.next=null;
            this.size =this.size+1;
        }
        printList(this.head);

    }
    public void insertAtBeginning(String value){
        node newnode = new node();
        newnode.item = value;

        newnode.next = head;
        this.head = newnode;
        printList(this.head);
        this.size =this.size+1;
    }
    public void insertAtPosition(String value,int pos){
        node newnode = new node();
        newnode.item = value;
        node current = this.head;
        int fpos=0;
        while(current.next != null){
            fpos++;
            if(fpos == pos){
                break;
            }
            current=current.next;

        }
        System.out.println(current.item);
//        newnode.next = current.next;
//        current.next = newnode;
        newnode.next = current.next;
        current.next=newnode;
        this.size =this.size+1;
        printList(this.head);
    }

    public void reverseList(){
        node prev = null;
        node current = head;
        while(current != null){
            head = current.next;
            current.next = prev;
            prev = current;
            current=head;
        }
        head = prev;
        printList(this.head);
    }

    public static void main(String[] args) {
        LinkedListImpl obj = new LinkedListImpl();
        obj.insertionAtEnd("Archi");
        obj.insertionAtEnd("Upa");
        obj.insertAtBeginning("Ritwik");
        obj.insertionAtEnd("Rishav");
        obj.insertAtPosition("Sangbaran",2);
        obj.reverseList();
    }
}
