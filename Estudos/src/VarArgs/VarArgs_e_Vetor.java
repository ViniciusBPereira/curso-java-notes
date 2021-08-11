package VarArgs;

public class VarArgs_e_Vetor {

    public static void main(String[] args) {

        //Passando um vetor de uma forma normal
        int[] vetor = {1, 2, 3, 4, 5};
        System.out.println("Normal: " + soma(vetor));

        System.out.println("-------------");

        //Passando um vetor com o VarArgs
        System.out.println("VarArgs: " + soma(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

    }

    //-----------------------------------------------------------------------------------------------//
    //                                           NORMAL                                              //
    //-----------------------------------------------------------------------------------------------//
    //int[] nome_da_variavel

    public static int soma(int[] vetor){
        int total = 0;

        for(int i = 0; i <= vetor.length - 1; i++){
                total += vetor[i];                //vetor[posição]. Está salvando os valores de posição em posição
            }

        return total;
    }

    //-----------------------------------------------------------------------------------------------//
    //                                           VARARGS                                             //
    //-----------------------------------------------------------------------------------------------//
    //Integer... nome_da_variavel

    public static int soma(Integer... vetor){
        int total = 0;

        for(int i = 0; i <= vetor.length - 1; i++){
            total += vetor[i];                    //vetor[posição]. Está salvando os valores de posição em posição
        }

        return total;
    }
}
