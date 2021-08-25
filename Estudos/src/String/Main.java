package String;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {

        char[] ArrayDeCaracteres = {'a', 'b', 'c', 'd', 'e'};
        String MudandoChar = new String(ArrayDeCaracteres);
        System.out.println("Transformando Char em String: " + MudandoChar);

        //-------------------------------------------------------//

        char[] ArrayDeCaracteres_2 = {'a', 'b', 'c', 'd', 'e'};
        String MudandoChar_2 = new String(ArrayDeCaracteres, 2, 3);
        System.out.println("Passando só o Char de determinada posição até determinado Char: " + MudandoChar_2);

        //-------------------------------------------------------//

        byte[] ArrayDeBytes = {65, 66, 67, 68 ,69};
        String MudandoByte = new String(ArrayDeBytes);
        System.out.println("Passando Byte para String de acordo com a tabelas Ascii: " + MudandoByte);

        //-------------------------------------------------------//

        byte[] ArrayDeBytes_2 = {65, 66, 67, 68 ,69};
        String MudandoByte_2 = new String(ArrayDeBytes_2, 1, 3);
        System.out.println("Passando só o valor do Byte de determinada posição até determinado velor do Byte: " + MudandoByte);

        //-------------------------------------------------------//

        String Texto_1 = "Curso";
        String Texto_2 = "Java";
        String Frase = Texto_1 + Texto_2;
        System.out.println("Concatenando duas String: " + Frase);

        //-------------------------------------------------------//

        String Dez = String.valueOf("10");
        System.out.println("Colocando valor em uma String: " + Dez);

        //-------------------------------------------------------//
        //Uma String é uma sequência de char

        String ExtraindoChar = "ABCDEF";
        System.out.print("Extraindo o char de uma string: ");
        for(int i = 0; i < ExtraindoChar.length(); i++){
        System.out.print(ExtraindoChar.charAt(i) + " ");
        }
        System.out.println();

        //-------------------------------------------------------//

        String ContandoFrase = "Um, Dois, Três";
        System.out.println("A String inicia com determinada palavra: " + ContandoFrase.startsWith("Um"));
        System.out.println("A String termina com determinada palavra: " + ContandoFrase.endsWith("Três"));

        //-------------------------------------------------------//
        // Tabela Ascii
        // -1 quando A < B
        // 0 quando A == B
        // 1 quando A > B

        String A = "a";
        String B = "b";
        System.out.println("Comparando duas String utilizando o comando 'compareTo': " + A.compareTo(B));

        //-------------------------------------------------------//
        //Se retorna -1 a palavra não foi encontrada
        //Existe o lastIndexOf(). É a última vez que determinada palava aparece

        String FraseAleatoria = "Hoje fui jogar futebol";
        System.out.println("Mostra a posicao de inicio de determinada palavra: " + FraseAleatoria.indexOf("jogar"));

        //-------------------------------------------------------//

        String FraseAleatoria_2 = "Hoje fui jogar futebol";
        System.out.println("Imprimindo um valor Booleano se a String tiver determinada palavra: " + FraseAleatoria_2.contains("jogar"));

        //-------------------------------------------------------//

        String TestandoSubString = "Hoje fui jogar futebol";
        System.out.println("Utilizando o SubString definindo o começo: " + TestandoSubString.substring(15));
        System.out.println("Utilizando o SubString definindo o começo e o fim: " + TestandoSubString.substring(9, 14));

        //-------------------------------------------------------//

        String ArrumandoString = "T e s t a n d i";
        String semEspaco = ArrumandoString.replace(" ", "");
        System.out.println("Arrumando String com o comando 'replace': " + semEspaco.replace("i", "o"));

        //-------------------------------------------------------//

        String TirandoPrimeiroEspaco = " Hoje vou jogar futebol";
        System.out.println("Tirando o espacamento inicial com o comando 'trim':" + TirandoPrimeiroEspaco.trim());

        //-------------------------------------------------------//

        String MaiusculoMinusculo = "ClasseDate";
        System.out.println("Transformando tudo em maiusculo com 'toUpperCase': " + MaiusculoMinusculo.toUpperCase());
        System.out.println("Transformando tudo em minusculo com 'toLowerCase': " + MaiusculoMinusculo.toLowerCase());

        //-------------------------------------------------------//

        String JuntadoLetras = String.join(", ", "A", "B", "C", "D", "E");
        System.out.println("Jutando valores em uma String com o comando 'join': " + JuntadoLetras);

        //-------------------------------------------------------//
        //É possível definir o delimitador para separar

        String[] SeparandoLetras = JuntadoLetras.split(", ");
        System.out.print("Ex1: Separando valores de uma String com o comando 'split' para um String[]: ");
        for (String Separando : SeparandoLetras){
            System.out.print(Separando);
        }
        System.out.println();

        //Exemplo 2

        String Info = "nome;idade;id";
        String[] formatar = Info.split(";");
        System.out.println("Ex2: Separando valores de uma String com o comando 'split' para um String[]: " + Arrays.toString(formatar));

        //-------------------------------------------------------//
        //O String Builder é igual o String Buffer
        //Porém o String Buffer é Thread Safe
        String[] Letras = {"A", "B", "C", "D"};
        String Alfabeto = "";
        StringBuffer sb = new StringBuffer();
        for(String Letra : Letras){
            sb.append(Letra);
        }
        System.out.println("Passando um Array de Strings para uma String com a instancia 'StringBuffer': " + sb);
        System.out.println("Passando os valores ao contrario com a instancia 'StringBuffer': " + sb.reverse());

        //-------------------------------------------------------//
        String ArquivoInfo = "1;Antonio;30;";
        StringTokenizer st = new StringTokenizer(ArquivoInfo, ";");

        
        System.out.print("Utilizando o 'StringTokenizer': ");
        while(st.hasMoreTokens()){
            System.out.print(st.nextToken() + " ");
        }

     }
}
