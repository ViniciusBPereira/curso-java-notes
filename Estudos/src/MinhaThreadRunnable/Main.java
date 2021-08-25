package MinhaThreadRunnable;

public class Main implements Runnable{

    private int tempo;
    private String nome;


    public Main(String nome, int tempo){
        this.nome = nome;
        this.tempo = tempo;
        Thread t = new Thread(this); //Forma 2.
        t.start();                         //Forma 2.

        /*
        Forma 2: nesse caso está instanciando da própria classe Thread
        'Thread nome_da_instância = new Thread(alvo)' e dentro do parameter
        está sendo passado essa Classe Main inteira '(this)' como alvo.
        */
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
