package striver.stackQueue;

import java.util.Scanner;

public class QueueUsingArray {


    static int MAX_SIZE=100;
    static int[] queue = new int[MAX_SIZE];
    static int rear=-1;


    static void push(int x){
        if(rear==MAX_SIZE-1){
            System.out.println("Queue overflowin!");
            return;
        }
        queue[++rear]=x;

    }

    static int pop(){
        if(rear==-1){
            System.out.println("Queue is empty!");
            return -1;
        }
        int temp=queue[0];
        int i=0;
        while(i<rear){
            queue[i]=queue[i+1];
            i++;
        }
        queue[rear]=0;
        rear--;
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
