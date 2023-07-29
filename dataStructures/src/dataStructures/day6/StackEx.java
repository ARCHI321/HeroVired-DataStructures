package dataStructures.day6;

import java.util.Scanner;

public class StackEx {
    public Object [] arr;
    public int size;
    public int top=-1;
    static Scanner sc = new Scanner(System.in);
    public StackEx(int size){
        this.size = size;
        this.arr = new Object[size];
    }
    public void push(Object a){
        if(top == -1){
            top=0;
        }
        else if(top == size-1){
            System.out.println("Overflow");
        }

        arr[top] = a;
        top++;


    }
    public Object pop(){
        if(top == -1){
            System.out.println("Underflow");
            return -1;
        }
        Object val = arr[--top];
        System.out.println(val + " is popped");
        sc.nextLine();
        return val;
    }
    public void printarr(){
        System.out.println("Printing the stack");
        for(int i=top-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        StackEx a = new StackEx(5);

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
                    a.push(b);
                    break;
                case 2:
                    Object c = a.pop();
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
