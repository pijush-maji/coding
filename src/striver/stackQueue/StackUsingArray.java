package striver.stackQueue;

import java.util.Scanner;

public class StackUsingArray {
    static int STACK_SIZE=1000;
    static int[] stack = new int[STACK_SIZE];
    static int top = -1;

    public static void push(int x){
        if(top==STACK_SIZE-1) {
            System.out.println("Stack Overflow!");
            return;
        }
        stack[++top]=x;
    }
    public static int pop(){
        if(top<0) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return stack[top--];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.println("\n1->Push \n2->POP");
            System.out.print("Enter your choice:");
            int n=in.nextInt();
            switch (n){
                case 1:
                    System.out.println("Enter the number to push:");
                    int x=in.nextInt();
                    push(x);
                    break;
                case 2:
                    int t = pop();
                    if(t!=-1)
                        System.out.print("Number removed->"+t);
                    break;
                default:
                    System.out.println("Invalid input");
                    System.exit(1);
            }
        }
    }
}
