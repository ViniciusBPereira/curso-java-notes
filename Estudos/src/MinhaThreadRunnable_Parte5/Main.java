package MinhaThreadRunnable_Parte5;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadAqui t1 = new ThreadAqui("#1");
        ThreadAqui t2 = new ThreadAqui("#2");

        t1.suspend();

        Thread.sleep(200);


        System.out.println("Pausando a Thread #2...");
        t2.suspend();

        System.out.println("Resumindo a Thread #1...");
        t1.resume();

        Thread.sleep(200);

        System.out.println("Resumindo a Thread #2...");
        t2.resume();

        System.out.println("Terminando a Thread #2...");
        t2.stop();

    }
}
