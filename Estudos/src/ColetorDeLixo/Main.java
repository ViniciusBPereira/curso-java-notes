package ColetorDeLixo;

public class Main {

    public static int[] Array = new int[1000000];
    public static int itemArray;

    public static void main(String[] args) {
        for(int i = 0; i < Array.length - 1; i++){
            int a = i + 1;
            Array[i] = a;
        }

        System.out.println("Array criado");
        obterMemoriaUsada();

//------------------------------------------------------------------------------//

        System.out.println();

        Array = null;
        Runtime.getRuntime().runFinalization();
        Runtime.getRuntime().gc();

//------------------------------------------------------------------------------//

        System.out.println("Array removido da memoria");
        obterMemoriaUsada();
    }

    public static void obterMemoriaUsada(){
        Runtime runtime = Runtime.getRuntime(); //singleton
        long valor = runtime.totalMemory() - runtime.freeMemory();
        System.out.printf("%s: %,dL", "Memory", valor); //Não sei converter pra Byte e depois MegaBity
    }
}
