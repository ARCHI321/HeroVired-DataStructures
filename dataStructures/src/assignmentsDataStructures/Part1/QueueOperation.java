package assignmentsDataStructures.Part1;

import java.util.Scanner;

class QueueEx {
    public Object [] arr;
    public int size;
    public int front,end;


    public QueueEx(int size){
        this.size = size;
        this.arr = new Object[size];
        front=-1;
        end=-1;
    }


    public boolean isEmpty(){
        return (front == -1 && end == -1) || (front == end) ;
    }
    public void enqueue(Object value){
        if(isEmpty()){
            front = 0;
            end = 0;
        }

        else if(end == size -1){
            System.out.println("Overflow");
            return;
        }
        arr[end] = value;
        end++;
        System.out.println(front + " " + end);
    }

    public int dequeue(){
        if(front == end || front == -1){
            System.out.println("Underflow");
            return -1;
        }
        else{
            --front;
            Object val = arr[front];
            System.out.println(val + " is popped");
            return (int) val;
        }
    }

    public int peek(){
        if(!isEmpty())
          return (int) arr[front];
        else
            System.out.println("No value");
            return -1;
    }


}

public class QueueOperation {
    public static void main(String[] args) {
        QueueEx a = new QueueEx(5);
        Scanner sc = new Scanner(System.in);
        int ans = 1;
        while(ans == 1){
            System.out.println("1. enqueue  2. dequeue  3. peek");
            System.out.print("Enter your choice : ");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("enter a number : ");
                    sc.nextLine();
                    int b = sc.nextInt();
                    a.enqueue(b);
                    break;
                case 2:
                    Object c = a.dequeue();
                    break;
                case 3:
                    System.out.println(a.peek());
                    break;
                default:
                    System.out.println("Wrong value entered");
            }
            System.out.print("Do you want to continue(1/0) : ");
            ans = sc.nextInt();
        }
    }
}
