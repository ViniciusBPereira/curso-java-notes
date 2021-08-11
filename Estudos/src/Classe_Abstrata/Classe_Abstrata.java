package Classe_Abstrata;

public abstract class Classe_Abstrata {
    public abstract void Metodo_Abstrato(String Parameter);

    public void Metodo_Normal_1(){
        //Corpo...
    }

    public String Metodo_Normal_2(){
        //Corpo...
        return null;
    }
}

/*

    >>> Uma classe abstrata não pode ser instanciada. 'Abstrata chamando = new Abstrata(); '.

    >>> Só classes abstratas podem ter métodos abstratos(um ou vários).
        > Métodos abstratos não tem corpo, no caso a {}. A primeira classe concreta que
          herdar da Classe Abstrata terá que sobrescrever obrigatoriamente o método abstrato
          da mesma forma, com o mesmo modificador de acesso, com o mesmo retorno, com os mesmos
          parameters e com o mesmo nome. Ao sobrescrever é possível implementar um corpo a ele.

    >>> Uma classe abstrata pode conter diversos métodos normais, porém eles não são obrigados
    a serem sobrescritos.

 */