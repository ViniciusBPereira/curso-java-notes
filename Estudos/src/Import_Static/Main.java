package Import_Static;

//import static java.lang.Math.pow;         //importando metodos especificos dentro da classe Math
//import static java.lang.Math.sqrt;
import static java.lang.Math.*;             //importando todos os metodos dentro da classe Math

public class Main {
    public static void main(String[] args) {

        double a = 2;
        double b = 3;
        double c = 4;

        //Utilizando o import normal
        System.out.println(Math.pow(a, b));
        System.out.println(Math.sqrt(c));

        //Utilizando o import static
        System.out.println(pow(a, b));
        System.out.println(sqrt(c));


    }
}
