package Deadlock;

public class Main {
    public static void main(String[] args) {

        final String recurso_1 = "Recurso #1";
        final String recurso_2 = "Recurso #2";

        Thread t1 = new Thread() {
            public void run() {
                synchronized (recurso_1) {
                    System.out.println("Thread #1: Bloqueou o recurso 1");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Thread #1: tentando utilizar o recurso 2");

                    synchronized (recurso_2){
                        System.out.println("Thread 1: Bloqueou o recurso 2");
                    }
                }
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                synchronized (recurso_2) {
                    System.out.println("Thread #2: Bloqueou o recurso 2");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Thread #2: tentando utilizar o recurso 1");

                    synchronized (recurso_1){
                        System.out.println("Thread 2: Bloqueou o recurso 1");
                    }
                }
            }
        };

        t1.start();
        t2.start();


    }
}
