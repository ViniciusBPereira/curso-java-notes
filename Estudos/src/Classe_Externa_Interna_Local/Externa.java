package Classe_Externa_Interna_Local;

public class Externa {

    private  String texto = "Externo";

    public class Interna{

        private String texto = "Interno";

        public void imprimitTexto() {
            System.out.println(texto);
            System.out.println(Externa.this.texto);
        }
        public void testeClasseLocal(){
            class Local{

                private String texto = "Local";

                public String getTexto(){
                    return texto;
                }
            }

            Local local = new Local();
            System.out.println(local.getTexto());
        }

    }

    public static void main(String[] args) {
        Externa externa = new Externa();
        Interna interna = externa.new Interna();

        interna.imprimitTexto();
        interna.testeClasseLocal();
    }
}
