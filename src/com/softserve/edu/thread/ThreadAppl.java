package com.softserve.edu.thread;

/*
 *      HW-3
 *      Create a thread «one», which would start the thread «two»,
 *      which has to output its number («Thread number two») 3 times and create thread «three»,
 *      which would to output message «Thread number three» 5 times.
 */


public class ThreadAppl {
    public static void main(String[] args) {
        Thread t2 = new Thread() {
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println("working thread \"two\"");
                }
                System.out.println("create thread «three»");
                Thread t3 = new Thread() {
                    public void run() {
                        for (int i = 0; i < 5; i++) {
                            System.out.println("working thread \"three\"");
                        }
                        System.out.println("Mission completed ");
                    }

                };
                t3.start();

            }

        };


        Thread t1 = new Thread() {
            public void run() {
                System.out.println("working thread \"one\"");
                t2.start();
                System.out.println("Start the thread \"two\"");
            }
        };


        try {
            t1.start();
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

}

