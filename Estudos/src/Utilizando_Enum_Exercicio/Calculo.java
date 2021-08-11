package Utilizando_Enum_Exercicio;

public class Calculo {

    enum Operacao{
        SOMAR("+") {
            @Override
            public double executar(double x, double y) {
                return x + y;
            }
        }, SUBTRAIR("-") {
            @Override
            public double executar(double x, double y) {
                return x - y;
            }
        }, MULTIPLICAR("*") {
            @Override
            public double executar(double x, double y) {
                return x * y;
            }
        }, DIVIDIR("/"){
            @Override
            public double executar(double x, double y){
                return x / y;
            }
        };

        private String simbolo;

        Operacao(String simbolo){
            this.simbolo = simbolo;
        }

        public abstract double executar(double x, double y);

        public String toString(){
            return simbolo;
        }

    }


    public static void main(String[] args) {
        double x = 2.0;
        double y = 3.0;

        for(Operacao Op : Operacao.values()){
            System.out.print(x + " ");
            System.out.print(Op.toString() + " ");
            System.out.print(y + " = ");
            System.out.println(Op.executar(x , y));
        }
    }
}
