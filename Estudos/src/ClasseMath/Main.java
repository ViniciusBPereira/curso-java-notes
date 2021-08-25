package ClasseMath;

public class Main {
    public static void main(String[] args) {
        System.out.println(Math.pow(2, 3));      //Elevação
        System.out.println(Math.round(4.6));     //Arredondar normal
        System.out.println(Math.ceil(4.7));      //Arredondar pra cima
        System.out.println(Math.floor(4.7));     //Arredondar pra baixo
        System.out.println(Math.random());       //Gerar numero aleatorio

        System.out.println(Math.round(Math.random() * 10));

        System.out.println(Math.sin(Math.toRadians(30))); //Seno
    }
}
