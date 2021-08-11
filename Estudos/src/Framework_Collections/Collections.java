package Framework_Collections;

import java.util.*;

public class Collections {
    public static void main(String[] args) {
        System.out.println("-----------------------------------------------------------------------------------------------");

        //-----------------------------------------------------------------------------------------------//
        //                                             LIST                                              //
        //-----------------------------------------------------------------------------------------------//

        //Caso utilize um ou mais valores/metodos de outra classe, é obrigatorio reescrever(Override)
        //o toString na outra classe para não printar o espaço alocado na memória. Vale pro LIST e pro SET


        List<Integer> Lista = new ArrayList<>(Arrays.asList(7, 8, 9, 10, 11, 1, 2, 3, 4, 5, 6, 12));
        //Lista.add(); adiciona um valor
        //Lista.remove(posição/valor); remove um valor espécifico ou remove uma posição espécifica
        //Lista.clear(); limpa a tabela
        //Lista.set(posição, valor); substitui o valor de determinada posição para o novo determinado valor
        System.out.println("Utilizando 'ArrayList' do LIST: " + Lista);

        List<Integer> Lista_1 = new LinkedList<>(Lista);
        System.out.println("Utilizando 'LinkedList' do LIST: " + Lista_1);
        System.out.println("-----------------------------------------------------------------------------------------------");

        //-----------------------------------------------------------------------------------------------//
        //                                             SET                                               //
        //-----------------------------------------------------------------------------------------------//

        //O SET não trabalha com posição, então os comandos envolvendo posições não são possíveis
        //E ele não trabalha com valores duplicado

        Set<Integer> Lista_2 = new HashSet<>(Arrays.asList(7, 8, 9, 10, 11, 1, 2, 13, 4, 5, 6, 12));
        Lista_2.add(3);
        Lista_2.add(12);
        System.out.println("Utilizando 'HashSet' do SET: " + Lista_2);

        Set<Integer> Lista_2_1 = new TreeSet<>(Lista_2);
        System.out.println("Utilizando 'TreeSet' do SET: " + Lista_2_1);
        System.out.println("-----------------------------------------------------------------------------------------------");

        //-----------------------------------------------------------------------------------------------//
        //                                             MAP                                               //
        //-----------------------------------------------------------------------------------------------//

        //Assim como o SET e o LIST, o MAP também está dentro do pacote java.util
        //Porém ele não se estende da Interface Collection assim como o LIST e o SET
        //Cada objeto que tem dentro do MAP possuí uma CHAVE única e um VALOR
        //O valor pode ser duplicado já a chave não

        Map<String, Integer> Lista_3 = new HashMap<>();

        Lista_3.put("gol", 14); //adiciona um valor, é similar o add(). O add() não funciona no MAP
        Lista_3.put("una", 15);
        Lista_3.put("mobi", 16);
        Lista_3.put("hb20", 13);
        Lista_3.put("kwid", 15);
        //Lista_3.put("key", valor); também é póssivel substituir um valor se colocar a key dele e o valor que você quer
        System.out.println("Utilizando 'HashMap' do MAP: " + Lista_3);

        Map<String, Integer> Lista_3_1 = new LinkedHashMap<>(Lista_3); //É utilizado para organizar na ordem que foi adicionado cada valor
        System.out.println("Utilizando 'LinkedHashMap' do MAP: " + Lista_3_1);

        Map<String, Integer> Lista_3_2 = new TreeMap<>(Lista_3); //É utilizado para organizar na ordem alfabetica da chave
        System.out.println("Utilizando 'TreeMap' do Map: " + Lista_3_2);
        System.out.println("-----------------------------------------------------------------------------------------------");

    }
}
