package Printf;

public class Usando_Printf {
    public static void main(String[] args) {

        System.out.printf("%s", "Hello World");
        System.out.println();
        System.out.printf("%S", "Hello World");
        System.out.println();

        System.out.printf("%c", 'c');
        System.out.println();
        System.out.printf("%C", 'c');
        System.out.println();

        System.out.printf("%n"); //pular linha, equivale o \n

// -------------------------------------------------------------------------------------------------------//

        int valor = 123456789;
        System.out.printf("%d", valor);
        System.out.println();

        System.out.printf("%+d", valor);
        System.out.println();

        System.out.printf("%015d", valor);
        System.out.println();

        System.out.printf("%,d", valor);
        System.out.println();

// -------------------------------------------------------------------------------------------------------//

        double pontoFlutuante = 3.3333669;

        System.out.printf("%f", pontoFlutuante);
        System.out.println();

        System.out.printf("%.3f", pontoFlutuante);
        System.out.println();

        System.out.printf("R$ %10.2f", pontoFlutuante);
        System.out.println();

// -------------------------------------------------------------------------------------------------------//

        String texto = "Ola Mundo";
        System.out.printf("%20s", texto);
        System.out.println();

        System.out.printf("%-20s", texto);
        System.out.println();
// -------------------------------------------------------------------------------------------------------//
        System.out.println();
        System.out.println("Teste mais completo");
        TesteMaisCompleto();
    }

    public static void TesteMaisCompleto(){
        double[] precos = {10000, 123.54, 7843.567, 1, 4.56789};

        for(int i = 0; i <= precos.length - 1; i++){
            System.out.printf("%s 0%d tem o valor: R$%10.2f%n", "Item", i+1, precos[i]);
        }
    }
}
