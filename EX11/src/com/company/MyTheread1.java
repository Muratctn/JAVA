package com.company;

public class MyTheread1 implements Runnable {
    Thread thread;

    MyTheread1(String name) {
        thread = new Thread(this, name);
    }

    public static MyTheread1 createAndStart(String name) {
        MyTheread1 myTheread1 = new MyTheread1(name);
        myTheread1.thread.start();
        return myTheread1;
    }

    public void run() {
        System.out.println(thread.getName() + "starts to operate");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(100);
                System.out.println(thread.getName() + "is executed, the counter valve:" + count);
            }
        } catch (InterruptedException e) {
            System.out.println(thread.getName() + "Has been interrupeted");
            System.out.println(thread.getName() + "Finishes running");}

        }
    }
    class MoreThreads2 {
        public static void main(String[] args) {
            System.out.println("The main threads starts running");
            MyTheread1 t1 = MyTheread1.createAndStart("Child thread # 1 ");
            MyTheread1 t2 = MyTheread1.createAndStart("Child thread # 2 ");
            MyTheread1 t3 = MyTheread1.createAndStart("Child thread # 3 ");
            System.out.println(".");
            // do {
            //     System.out.println(".");
            //    try {
            //        Thread.sleep(100);
            //    }catch (InterruptedException e){
            //        System.out.println("The main thread has been terminated");
            //    }
            //}while (myTheread1.thread.isAlive() || myTheread2.thread.isAlive()||myTheread3.thread.isAlive());
            //System.out.println("The main thread is exiting");


            try {
                t1.thread.join();
                t2.thread.join();
                t3.thread.join();
            }

            catch (InterruptedException ie) {
                System.out.println("The main thread has been terminated");}
            System.out.println("The main thread is exiting");




        }
    }

