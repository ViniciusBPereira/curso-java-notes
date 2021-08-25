package ResourceBundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class Main {

    public static void main(String[] args) {
        //instância.getBundle("nome_do_ResourceBundle") chamando o arquivo com a locale(localização) padrão "Português"
        //"nome_do_ResouceBundle" + Locale

        System.out.println(Locale.getDefault());                    //Imprimindo a localização padrão. Portugês_Brasil
        ResourceBundle rb = ResourceBundle.getBundle("meu-texto");  //Instanciando o arquivo ResourceBundle e passando o nome
        System.out.println("Ola: " + rb.getString("hello"));    //Pegando o valor da key determinada com getString
        System.out.println("Mundo: " + rb.getString("world"));  //Pegando o valor da key determinada com getString()

        System.out.println("---------------------------------");

        //-------------------------------------------------------------------------
        //instância.getBundle("nome_do_ResouceBundle") chamando o arquivo com a locale(localização) definido "Inglês"
        //"nome_do_ResouceBundle" + Locale

        Locale.setDefault(new Locale("en", "US"));     //Mudando a localização padrão pra Inglês
        System.out.println(Locale.getDefault());                      //Imprimindo a localização atual
        rb = ResourceBundle.getBundle("meu-texto");                   //Instanciando o arquivo ResourceBundle e passando o nome
        System.out.println("Hello EN: " + rb.getString("hello")); //Pegando o valor da key determinada com getString()
        System.out.println("World EN: " + rb.getString("world")); //Pegando o valor da key determinada com getString()
    }
}
