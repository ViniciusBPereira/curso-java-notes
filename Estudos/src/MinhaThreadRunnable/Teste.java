package MinhaThreadRunnable;

public class Teste{
    public static void main(String[] args) {

        Main thread1 = new Main("#1", 900);

        //Thread t1 = new Thread(thread1);          //Forma 1
        //t1.start();                               //Forma 1

        Main thread2 = new Main("#2", 650);
        Main thread3 = new Main("#3", 1100);

    }
}
