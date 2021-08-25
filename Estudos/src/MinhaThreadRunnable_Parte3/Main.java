package MinhaThreadRunnable_Parte3;

import MinhaThreadRunnable_Parte2.*;

public class Main {

    public static void main(String[] args) {
        Teste thread1 = new Teste("#1", 500);
        Teste thread2 = new Teste("#2", 500);
        Teste thread3 = new Teste("#3", 500);

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);

        t1.setPriority(5);  //'nome_da_instância.setPriority(numero)' serve para informar qual thread vai começar primeiro
        t2.setPriority(3);  //Quanto maior o número definido maior a prioridade
        t3.setPriority(1);

        //t1.setPriority(Thread.MAX_PRIORITY); também é possível definir a prioridade dessa forma
        //t1.setPriority(Thread.NORM_PRIORITY);
        //t1.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();


    }
}
