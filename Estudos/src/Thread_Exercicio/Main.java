package Thread_Exercicio;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadSemafaro semafaro = new ThreadSemafaro();

        for(int i = 0; i < 10; i++){
            System.out.println(semafaro.getCor());
            semafaro.esperaCorMudar();
        }

        semafaro.desligarSemafaro();
    }
}
