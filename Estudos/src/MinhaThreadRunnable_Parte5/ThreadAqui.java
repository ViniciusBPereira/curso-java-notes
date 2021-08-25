package MinhaThreadRunnable_Parte5;

public class ThreadAqui implements Runnable {

    private String nome;
    private boolean estaSuspensa;
    private boolean foiTerminada;

    public ThreadAqui(String nome) {
        this.nome = nome;
        estaSuspensa = false;
        Thread t = new Thread(this, nome);
        t.start();
    }

    @Override
    public void run() {
        System.out.println("Executando " + nome + "...");

        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread " + nome + " executando: " + i);
                Thread.sleep(300);
                synchronized (this) {
                    while (estaSuspensa) {
                        wait();
                    }
                    if (this.foiTerminada) {
                        break;
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread " + nome + " terminou...");

    }

    void suspend() {
        this.estaSuspensa = true;
    }

    synchronized void resume() {
        this.estaSuspensa = false;
        notify();
    }

    synchronized void stop() {
        this.foiTerminada = true;
        notify();
    }

}
