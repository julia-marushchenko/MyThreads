// Java program to create and run threads

package com.threads;

// Main class
public class Main extends Thread {

    // Runner method
    public void run(){
        System.out.println("Thread is running. Main class");
    }

    // Main method to run java program
    public static void main(String [] args){

        // Creating new thread with name t
        Thread t = new Main();
        t.start();
        Main1 obj =  new Main1();

        // Creating new thread with name t1
        Thread t1 = new Thread(obj);
        t1.start();
        // Stopping thread t
        t.interrupt();
        // Stopping thread t1
        t1.interrupt();
    }
}

// Main1 class
class Main1 implements Runnable {

    // Runner method
    @Override
    public void run() {
        System.out.println("Thread is running. Main1 class");
    }
}