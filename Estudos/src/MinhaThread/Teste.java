package MinhaThread;

public class Teste {

    public static void main(String[] args) {

        Main thread = new Main("Thread #1", 1000);
        /*
        O comando 'nome_da_instância.start()' é o comando utilizado para começar uma thread
        nesse caso seria 'thread.start()', porém o construtor da classe Main já inicia a
        thread com o 'start()' então toda a vez que uma nova instância for criada, ela
        automaticamente irá começar.
        */

        Main thread2 = new Main("Thread #2", 1500);
        //'thread2.start()' desnecessário.

        Main thread3 = new Main("Thread #3", 500);
        //'thread3.start()' desnecessário.
    }
}
