package dataStructures.day6;

import java.util.Scanner;

public class QueueEx {
    public Object [] arr;
    public int size;
    public int front,end;
    static Scanner sc = new Scanner(System.in);
    public QueueEx(int size){
        this.size = size;
        this.arr = new Object[size];
        front=-1;
        end=-1;
    }
    public void printarr(){
        System.out.println("Printing the stack");
        for(int i=0;i<end-1;i++){
            System.out.print(arr[i] + "->");
        }
        System.out.println(arr[end] + "->");
    }

    public void enqueue(Object value){
        if(front == -1 && end == -1){
            front = 0;
            end = 0;
        }

        else if(end == size -1){
            System.out.println("Overflow");
        }
        arr[end] = value;
        end++;
        System.out.println(front + " " + end);
    }

    public Object dequeue(){
        if(front == end || front == -1){
            System.out.println("Underflow");
            return -1;
        }
        else{
            --front;
            Object val = arr[front];
            System.out.println(val + " is popped");
            return val;
        }
    }
    public static void main(String[] args) {
        QueueEx a = new QueueEx(5);

        String ans = "yes";
        while(ans.equals("yes")){
            System.out.println("1. push  2. pop  3. print");
            System.out.print("Enter your choice : ");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("enter a name : ");
                    sc.nextLine();
                    String b = sc.nextLine();
                    a.enqueue(b);
                    break;
                case 2:
                    Object c = a.dequeue();
                    break;
                case 3:
                    a.printarr();
                    break;
                default:
                    System.out.println("Wrong value entered");
            }
            System.out.println("Do you want to continue(yes/no) : ");
            ans = sc.nextLine();
        }
    }

}
