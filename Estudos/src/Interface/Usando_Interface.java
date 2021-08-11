package Interface;

public interface Usando_Interface{

    //TODAS AS VARIÁVEIS DENTRO DE UMA INTERFACE SERÃO FINAL, ESTÁTICA E PUBLICAS AUTOMATICAMENTE.
    //TODOS OS MÉTODOS DENTRO DE UMA INTERFACE SERÃO ABSTRATOS E PUBLICOS AUTOMATICAMENTE.


    String Variavel = "Qualquer Coisa";

    /*
    Esse atributo já vai ser automaticamente public, static e final de forma implícita
    e é por isso necessário colocar um valor, se não retornará um erro.
    */

    void metodo(); //Exemplo 1
    int metodo_1(); //Exemplo 2
    String metodo_2(); //Exemplo 3
    //...

    /*
    Esse método já vai ser automaticamente public de forma implícita e é por isso não irá
    ter corpo esse método, se não retornará um erro.
    */

    //Uma Classe não pode herdar(extend) de uma ‘interface’, ela implementa(implement) ‘interface’
}
