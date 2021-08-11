package MinhaThread;

public class Teste {

    public static void main(String[] args) {

        Main thread = new Main("Thread #1", 1000);
        //thread.start();

        Main thread2 = new Main("Thread #2", 1500);

        Main thread3 = new Main("Thread #3", 500);
    }
}
