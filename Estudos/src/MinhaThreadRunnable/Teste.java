package MinhaThreadRunnable;

public class Teste{
    public static void main(String[] args) {

        Main thread1 = new Main("#1", 900);

        //Thread t1 = new Thread(thread1);          //Forma 1
        //t1.start();                               //Forma 1

        /*
        Forma 1: nesse caso está instanciando também da própria classe Thread
        'Thread nome_da_instância = new Thread(alvo)' e dentro do parameter está
        sendo passado a instância criada da Classe Main como alvo. A única diferença
        da Forma 2 e da Forma 1 é que na Forma 1 é necessário instância a Classe
        Thread manualmente toda a vez que quer começar um thread, teria que fazer
        isso com a thread 2 e thread 3, o alvo irá ser só aquela instância da Classe
        Main, já na Forma 2 a classe Thread será instância-da automaticamente toda a vez
        que criar uma instância da Classe Main.
        */

        Main thread2 = new Main("#2", 650);
        Main thread3 = new Main("#3", 1100);

    }
}
