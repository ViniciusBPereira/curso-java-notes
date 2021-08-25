package MinhaThreadRunnable_Parte4;

public class Teste implements Runnable{

    private String nome;
    private int[] nums;
    private static Calculadora chamando = new Calculadora();

    public Teste(String nome, int[  ] nums){
        this.nome = nome;
        this.nums = nums;
        new Thread(this, nome).start();
    }

    @Override
    public void run() {

        System.out.println(this.nome + " iniciada");

        int resultado = chamando.Array(this.nums);

        System.out.println("Thread " + this.nome + " resultado da soma: " + resultado);

        System.out.println(this.nome + " terminada");

    }
}
