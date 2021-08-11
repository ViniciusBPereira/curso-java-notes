package Interface;

public class Main implements Usando_Interface {
    public static void main(String[] args) {
        //Corpo...
    }

    @Override
    public void metodo() { //Observação: Na hora de sobrescrever o método abstrato é obrigatório escrever o public.
        //Corpo do Método Abstrato... Sem saída
    }

    @Override
    public int metodo_1() { //Observação: Na hora de sobrescrever o método abstrato é obrigatório escrever o public.
        //Corpo do Método Abstrato... Saída com Número
        return 0;
    }

    @Override
    public String metodo_2() { //Observação: Na hora de sobrescrever o método abstrato é obrigatório escrever o public.
        //Corpo do Método Abstrato... Saída com Palavra/Frase
        return null;
    }
}
