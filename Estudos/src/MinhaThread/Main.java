package MinhaThread;

public class Main extends Thread {
    /*
    O 'extends Thread' não é muito utilizado na criação de Thread porque uma Classe só possibilita uma herança
    então é normalmente utilizado o 'implements Runnable'.
    */

    private String nome;
    private int tempo;

    public Main(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;
        start(); //Comando utilizado para começar a thread toda a vez que a Classe Main for instância-da
    }


    public void run() {
        /*
        No momento que herda Classe Thread ou implementa a Classe Runnable, deve obrigatoriamente
        sobrescrever o método run da classe original e colocar os comandos de manipulação de thread
        dentro dela.
        */
        try {
            for (int i = 0; i < 6; i++) {
                System.out.println(nome + " contador " + i);
                Thread.sleep(tempo);
                /*
                Comando da propria Classe Thread, 'Thread.sleep()' é o tempo de execução
                para a Thread terminar a sua ação, "dormir". Então quanto menor o tempo,
                mais rápido era irá executar os seus comandos até acabar. É obrigatório
                e automaticamente implementado um comando 'try{}' e um 'catch(){}'.
                Obs: Assim que instância a Classe Main todas as thread criadas através da
                classe, passa por esse comando, no caso foram a thread1, thread2 e thread3.
                */
            }
        } catch(InterruptedException e){
                e.printStackTrace();
        }

        System.out.println(nome + " terminou o processo");
    }
}
