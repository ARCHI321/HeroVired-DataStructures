package assignmentsDataStructures.Part1;

class NodeStruct{
    public String item;
    public NodeStruct next;

}
class LinkedListImpl1 {
    public NodeStruct head;
    public NodeStruct tail;
    public int size;
    public LinkedListImpl1(){
        this.head = null;
        this.size = 0;
    }
    public String printList(NodeStruct head){
        String word = "";
        System.out.println("Printing the linked list :");
        NodeStruct current = this.head;
        while(current.next != null){
            word += current.item;
            System.out.print(current.item+"->");
            current=current.next;
        }
        word += current.item;
        System.out.println(current.item);
        return word;
    }
    public void insertionAtEnd(String value){
        NodeStruct newNode = new NodeStruct();
        String word = "";
        newNode.item = value;
        word += value;
        NodeStruct current = this.head;
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


    public void reverseList(){
        NodeStruct prev = null;
        NodeStruct current = this.head;
        String revWord = "";
        while(current != null){
            revWord += head.item;
            head = current.next;
            current.next = prev;
            prev = current;
            current=head;
        }
        head = prev;
    }





}

public class LinkedListReverse {
    public static void main(String[] args) {
        LinkedListImpl1 obj = new LinkedListImpl1();
        obj.insertionAtEnd("M");
        obj.insertionAtEnd("s");
        obj.insertionAtEnd("D");
        obj.insertionAtEnd("k");
        obj.insertionAtEnd("M");
        System.out.println(obj.printList(obj.head));
        String word = obj.printList(obj.head);
        obj.reverseList();
        System.out.println(obj.printList(obj.head));
        String revWord = obj.printList(obj.head);
        if(word.equals(revWord)){
            System.out.println("Word is pallindrome");
        }
        else{
            System.out.println("Word is not pallindrome");
        }

    }
}
