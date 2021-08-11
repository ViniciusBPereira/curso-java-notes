package MinhaThreadRunnable;

public class Main implements Runnable{

    private int tempo;
    private String nome;


    public Main(String nome, int tempo){
        this.nome = nome;
        this.tempo = tempo;
        Thread chamando = new Thread(this); //Forma 2
        chamando.start();                         //Forma 2
    }

    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            System.out.println(nome + " contador " + i);
            try {
                Thread.sleep(tempo);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(nome + " terminou o processo");

    }
}
