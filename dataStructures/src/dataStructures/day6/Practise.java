package dataStructures.day6;

import java.util.Stack;

public class Practise {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("A");

        stack.push("B");

        System.out.println(stack.pop());

        System.out.println(stack.isEmpty());
    }
}
