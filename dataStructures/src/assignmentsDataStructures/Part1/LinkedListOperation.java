package assignmentsDataStructures.Part1;



class Node{
    public int item;
    public Node next;

}
class LinkedListImpl {
    public Node head;
    public Node tail;
    public int size;
    public LinkedListImpl() {
        this.head = null;
        this.size = 0;
    }
    public void add(int data){
        Node newNode = new Node();
        newNode.item = data;

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

    }

    public void remove(int data){
        Node temp = this.head;
        if (contains(data)) {
            while(temp.next != null ){
                if(temp.item == data){
                    break;
                }
                temp = temp.next;
            }
            this.size -= 1;
        }
        else{
            System.out.println("Value doesn't exist");
        }


    }

    public boolean contains(int data){
        Node temp = this.head;
        int flag =0;
        while(temp.next != null ){
            if(temp.item == data){
                flag = 1;
                break;
            }
            temp = temp.next;
        }

        if(flag == 1){
            return true;
        }
        else
            return false;
    }
    public int size(){
        return this.size;
    }

}
public class LinkedListOperation {
    public static void main(String[] args) {
        LinkedListImpl obj = new LinkedListImpl();
        obj.add(1);
        obj.add(2);
        obj.add(3);
        System.out.println(obj.size());
        obj.remove(2);
        System.out.println(obj.size());
        obj.remove(10);
        System.out.println(obj.size());
    }
}
