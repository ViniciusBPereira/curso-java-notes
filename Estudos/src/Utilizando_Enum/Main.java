package Utilizando_Enum;

public class Main {
    public static void main(String[] args) {
        //--------------------------------------------------------------------------------------------//
                                                    //CONSTANTE
        //--------------------------------------------------------------------------------------------//

        usandoConstante();

        System.out.println("---------------------------------------------------------");

        //--------------------------------------------------------------------------------------------//
                                                    //ENUM
        //--------------------------------------------------------------------------------------------//

        usandoEnum();

        System.out.println("---------------------------------------------------------");

        //--------------------------------------------------------------------------------------------//
                                                    //ENUM .value()
        //--------------------------------------------------------------------------------------------//

        System.out.println("Utilizando '.value()' do ENUM Java");

        //.values() comando padrão do Enum, que serve para manipular todas as constantes
        DiaSemana[] dias = DiaSemana.values(); //Nesse caso, criei um Array e aloquei todas as constantes do Enum como valor

        for(int i = 0; i < dias.length; i ++){
            System.out.println(dias[i]); //printei posição por posição
        }

        System.out.println("---------------------------------------------------------");

        //--------------------------------------------------------------------------------------------//
                                                    //ENUM .valueof()
        //--------------------------------------------------------------------------------------------//

        System.out.println("Utilizando '.valueof()' do ENUM Java");
        DiaSemana dia;

        //sintaxe padrão: 'Enum.valuesof(nome_do_enum.class, nome_da_constante)'
        //Nesse caso estou printando o valor da constante DOMINGO
        System.out.println(Enum.valueOf(DiaSemana.class, "DOMINGO"));

        //Nesse caso estou alocando o valor da constante SABADO e depois imprimindo
        DiaSemana dia1 = Enum.valueOf(DiaSemana.class, "SABADO");
        System.out.println(dia1);
    }
//-----------------------------------------------------------------------------------------------------------------
    private static void usandoConstante() {
        int segunda = DiaDaSemanas.Segunda;
        int terça = DiaDaSemanas.Terça;
        int quarta = DiaDaSemanas.Quarta;
        int quinta = DiaDaSemanas.Quinta;
        int sexta = DiaDaSemanas.Sexta;
        int sabado = DiaDaSemanas.Sabado;
        int domingo = DiaDaSemanas.Domingo;

        System.out.println("Teste utilizando CONSTANTE no JAVA");
        imprimir_Dia(segunda);
        imprimir_Dia(terça);
        imprimir_Dia(quarta);
        imprimir_Dia(quinta);
        imprimir_Dia(sexta);
        imprimir_Dia(sabado);
        imprimir_Dia(domingo);
    }


    private static void imprimir_Dia(int dia) {
        switch (dia) {
            case 1:
                System.out.println("Segunda");
                break;
            case 2:
                System.out.println("Terça");
                break;
            case 3:
                System.out.println("Quarta");
                break;
            case 4:
                System.out.println("Quinta");
                break;
            case 5:
                System.out.println("Sexta");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
        }

    }

    private static void usandoEnum() {
        System.out.println("Teste utilizando ENUM Java");
        System.out.println(DiaSemana.SEGUNDA.toString() + " - " + DiaSemana.SEGUNDA.getValor());
        System.out.println(DiaSemana.TERÇA.toString() + " - " + DiaSemana.TERÇA.getValor());
        System.out.println(DiaSemana.QUARTA.toString() + " - " + DiaSemana.QUARTA.getValor());
        System.out.println(DiaSemana.QUINTA.toString() + " - " + DiaSemana.QUINTA.getValor());
        System.out.println(DiaSemana.SEXTA.toString() + " - " + DiaSemana.SEXTA.getValor());
        System.out.println(DiaSemana.SABADO.toString() + " - " + DiaSemana.SABADO.getValor());
        System.out.println(DiaSemana.DOMINGO.toString() + " - " + DiaSemana.DOMINGO.getValor());
    }
}



