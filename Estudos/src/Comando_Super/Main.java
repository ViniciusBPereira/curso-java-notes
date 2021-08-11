package Comando_Super;

public class Main {
    //Caso uma classe não tenha um construtor, por padrão e de forma implicita(background) o construtor será assim:

    public Main(){
        super();
    }

    public static void main(String[] args) {
        //Programa...
    }

    /*Toda classe é derivada de forma implicita(background) a classe chamada Object então
    essa classe não é exceção. Então o 'super()' é utilizado para chamar o construtor da
    classe pai ou super class Object.
    */
}

