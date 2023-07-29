package assignmentsDataStructures.Part1;

import dataStructures.day6.StackEx;

import java.util.Scanner;

class StackImpl {
    public Object [] stack;
    public int size;
    public int top=-1;
    static Scanner sc = new Scanner(System.in);
    public StackImpl(int size){
        this.size = size;
        this.stack = new Object[size];
    }
    public boolean isEmpty(){
        return top == -1;
    }

    public void push(int data) {
        if (top == size - 1) {
            System.out.println("Stack Overflow!");
            return;
        }
        stack[++top] = data;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow!");
            return -1;
        }
        return (int) stack[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty!");
            return -1;
        }
        return (int) stack[top];
    }


}

public class StackOperation{
    public static void main(String[] args) {
        StackImpl a = new StackImpl(5);
        Scanner sc = new Scanner(System.in);
        int ans = 1;
        while(ans == 1){
            System.out.println("1. push  2. pop  3. peek");
            System.out.print("Enter your choice : ");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("enter a number : ");
                    sc.nextLine();
                    int b = sc.nextInt();
                    a.push(b);
                    break;
                case 2:
                    int c = a.pop();
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
