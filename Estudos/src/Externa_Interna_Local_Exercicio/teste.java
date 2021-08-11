package Externa_Interna_Local_Exercicio;

public class teste {
    public class teste1{
        public class teste2{
            public class teste3{
                public void local(){
                    class ClasseLocal{
                        private String texto = "flag";
                    }
                    ClasseLocal Opa = new ClasseLocal();
                    System.out.println(Opa.texto);
                }
            }
        }
    }

    public static void main(String[] args) {
        teste primeiro = new teste();
        teste1 segundo = primeiro.new teste1();
        teste1.teste2 terceiro = segundo.new teste2();
        teste1.teste2.teste3 quarto = terceiro.new teste3();
        quarto.local();
    }

}
