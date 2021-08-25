package MinhaThreadRunnable_Parte4;

public class Calculadora {

    private int soma;
    private int[] Array;


    public synchronized int Array(int[] Array) {

        soma = 0;

        this.Array = Array;


        try {
            for (int i = 0; i < 5; i++) {
                soma += Array[i];

                System.out.println("Executando a soma, Thread " + Thread.currentThread().getName() + " somando o valor " + Array[i] + " com o total de " + soma);

                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return soma;
    }
}
