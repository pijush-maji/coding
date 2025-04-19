package striver.stackQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class StackUsingQueue {

    static Queue<Integer> q1 = new LinkedList<>();
    static Queue<Integer> q2 = new LinkedList<>();

    static void push(int x){
        q1.add(x);
        q1.peek();
    }

    static int pop(){
        if(q1.isEmpty()){
            System.out.println("Stack is empty!");
            return -1;
        }
        while(q1.size()!=1){
            q2.add(q1.remove());
        }
        int temp = q1.remove();
        q1=q2;
        q2=new LinkedList<>();
        return temp;
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
