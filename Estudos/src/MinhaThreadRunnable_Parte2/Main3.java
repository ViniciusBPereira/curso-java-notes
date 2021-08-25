package MinhaThreadRunnable_Parte2;

public class Main3 {
    public static void main(String[] args) {

        Teste thread1 = new Teste("#1", 500);
        Teste thread2 = new Teste("#2", 700);
        Teste thread3 = new Teste("#3", 800);


        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);

        t1.start();
        t2.start();
        t3.start();


        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Programa Finalizado");

    }
}
