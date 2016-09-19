package com.git.practice.maven;

import java.util.Arrays;
public class TheQueue {
    private String[] queueArray;
    private int queueSize;

    private int front, numberOfItems, rear = 0;

    TheQueue(int size){

        queueSize = size;

        queueArray = new String[size];


        Arrays.fill(queueArray, "-1");

    }

    public void insert(String input){

        if(numberOfItems + 1 <= queueSize){

            queueArray[rear] = input;

            rear++;

            numberOfItems++;

            System.out.println("INSERT " + input + " Was Added to the Stack\n");
            

        } else {

            System.out.println("Sorry But the Queue is Full");

        }

    }

    public void priorityInsert(String input){

        int i;

        if(numberOfItems == 0){

            insert(input);

        } else {

            for(i = numberOfItems-1; i >= 0; i--){

                if(Integer.parseInt(input) > Integer.parseInt(queueArray[i])){

                    queueArray[i+1] = queueArray[i];

                } else break; // Done shifting items in queue

            }

            
            queueArray[i+1] = input;
            displayTheQueue();
            rear++;

            numberOfItems++;

        }

    }

    public void remove(){

        if(numberOfItems > 0){

            System.out.println("REMOVE " + queueArray[front] + " Was Removed From the Queue\n");

            queueArray[front] = "-1";

            front++;

            numberOfItems--;

        } else {

            System.out.println("Sorry But the Queue is Empty");

        }

    }

    public void peek(){

        System.out.println("The First Element is " + queueArray[front]);

    }

    public void displayTheQueue(){

        for(int n = 0; n < 61; n++)System.out.print("-");

        System.out.println();

        for(int n = 0; n < queueSize; n++){

            System.out.format("| %2s "+ " ", n);

        }

        System.out.println("|");

        for(int n = 0; n < 61; n++)System.out.print("-");

        System.out.println();

        for(int n = 0; n < queueSize; n++){

            if(queueArray[n].equals("-1")) System.out.print("|     ");

            else System.out.print(String.format("| %2s "+ " ", queueArray[n]));

        }

        System.out.println("|");

        for(int n = 0; n < 61; n++)System.out.print("-");

        System.out.println();

        int spacesBeforeFront = 3*(2*(front+1)-1);

        for(int k = 1; k < spacesBeforeFront; k++)System.out.print(" ");

        System.out.print("F");

        int spacesBeforeRear = (2*(3*rear)-1) - (spacesBeforeFront);

        for(int l = 0; l < spacesBeforeRear; l++)System.out.print(" ");

        System.out.print("R");

        System.out.println("\n");

}

    public static void main(String[] args){

        TheQueue theQueue = new TheQueue(10);

        theQueue.priorityInsert("10");

        theQueue.priorityInsert("19");

        theQueue.priorityInsert("11");
        
        theQueue.priorityInsert("15");

        theQueue.displayTheQueue();

        theQueue.remove();

        theQueue.displayTheQueue();

        theQueue.remove();

        theQueue.displayTheQueue();

        theQueue.peek();

    }

}
