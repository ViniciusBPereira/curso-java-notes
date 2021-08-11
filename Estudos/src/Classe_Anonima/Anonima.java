package Classe_Anonima;

public class Anonima {

    public void imprimirTexto(){
        System.out.println("texto");
    }

    public static void main(String[] args) {

        Anonima classeAnonima = new Anonima(){
            public void imprimirTexto(){
                System.out.println("texto - sobrescrito");
            }
        };

        classeAnonima.imprimirTexto();

        Texto texto = new Texto() {
            @Override
            public void imprimirTexto() {
                System.out.println("texto - interface");
            }
        };

        texto.imprimirTexto();
    }
}
