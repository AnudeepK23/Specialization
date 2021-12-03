package com.day10;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args){
        // Create and initialize a Queue using a LinkedList
        Queue<String> waitingQueue = new LinkedList<>();

       //  Adding new elements to the Queue (The Enqueue operation)
        waitingQueue.add("Chess");
        waitingQueue.add("Ball");
        waitingQueue.add("Volleyball");
        waitingQueue.add("Cricket");
        System.out.println("Waiting Queue :"+waitingQueue);
     //    Removing an element from the Queue using remove() (The Dequeue operation)
      //   The remove() method throws NoSuchElementException if the Queue is empty

        String name = waitingQueue.remove();
        System.out.println("Remove from Waiting Queue : "+name+"\n New waiting Queue :"+waitingQueue);
//        String name = waitingQueue.remove();
//        System.out.println("Remove from Waiting Queue : "+name+"\n New waiting Queue :"+waitingQueue);
//        String name = waitingQueue.remove();
//        System.out.println("Remove from Waiting Queue : "+name+"\n New waiting Queue :"+waitingQueue);
//        String name = waitingQueue.remove();
//        System.out.println("Remove from Waiting Queue : "+name+"\n New waiting Queue :"+waitingQueue);
//        String name = waitingQueue.remove();
//        System.out.println("Remove from Waiting Queue : "+name+"\n New waiting Queue :"+waitingQueue);
//         Removing an element from the Queue using poll()
//         The poll() method is similar to remove() except that it returns null if the Queue is empty.

        name = waitingQueue.poll();
        System.out.println("Remove from Waiting Queue : "+name+" \nNew waiting Queue :"+waitingQueue);
        name = waitingQueue.poll();
        System.out.println("Remove from Waiting Queue : "+name+" \nNew waiting Queue :"+waitingQueue);

        name = waitingQueue.poll();
        System.out.println("Remove from Waiting Queue : "+name+" \nNew waiting Queue :"+waitingQueue);

        name = waitingQueue.poll();
        System.out.println("Remove from Waiting Queue : "+name+" \nNew waiting Queue :"+waitingQueue);





    }
}
