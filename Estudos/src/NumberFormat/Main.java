package NumberFormat;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Main {

    public static void main(String[] args) throws ParseException {
        // 1.000,00 - Brasil
        // 1,000.00 - EUA

        Locale en = new Locale("en", "United Stated");
        NumberFormat nf = NumberFormat .getInstance(en);
        String num = nf.format(100.99);
        System.out.println("Estados Unidos: " + num + " - Utilizando '.getInstance()'");

        // ------------------------------------------------------------------//

        Locale br = new Locale("pt", "Brazil");
        nf = NumberFormat.getInstance(br);
        num = nf.format(100.99);
        System.out.println("Brasil: " + num + " - Utilizando '.getInstance()'");

        System.out.println("--------------------------------------------------------------------");
        // ------------------------------------------------------------------//

        NumberFormat dinheiro = NumberFormat.getCurrencyInstance(); // Brasil por padrão
        String valor = dinheiro.format(100.99);
        System.out.println("Brasil: " + valor +  " - Utilizando '.getCurrencyInstance()'");

        Locale us = Locale.US;
        dinheiro = NumberFormat.getCurrencyInstance(us);
        valor = dinheiro.format(100.99);
        System.out.println("Estados Unidos: " + valor + " - Utilizando '.getCurrencyInstance()'");

        // ------------------------------------------------------------------//
        //Porcentagem

        NumberFormat porcent  = NumberFormat.getPercentInstance();
        String porcentagem = porcent.format(99.987); //Porcentagem, esse número dividido por 100
        System.out.println(porcentagem + " - Utilizando '.getPercentInstance()'");

        porcent.setMaximumIntegerDigits(4);     //Definindo a quantidade maxima de números na casa inteira
        porcent.setMinimumIntegerDigits(2);     //Definindo a quantidade minima de números na casa inteira

        porcent.setMaximumFractionDigits(2);    //Definindo a quantidade maxima de números na casa decimal
        porcent.setMinimumFractionDigits(1);    //Definindo a quantidade minima de números na casa decimal

        porcentagem = porcent.format(99.987);
        System.out.println(porcentagem + " - Utilizando '.getPercentInstance()' Definindo Quantidade MIN e MAX de Casas");

        // ------------------------------------------------------------------//
        // ARREDONDAMENTO

        nf = NumberFormat.getInstance();
        nf.setRoundingMode(RoundingMode.DOWN); //RoudingMode é uma classe de arredondamento. Há varias opções dentro dela

        nf.setMaximumFractionDigits(0);        //Obrigatário definir isso para funcionar
        nf.setMinimumFractionDigits(0);        //Obrigatário definir isso para funcionar

        String Arredondar = nf.format(99.50);
        System.out.println(Arredondar + " - Utilizando '.setRoudingMode()");

        // ------------------------------------------------------------------//
        // PARSEAR(TRANSFORMAR)
        // Observação: Locale padrão Brasil. 100,00 = 100 reais

        Number num3 = nf.parse("100,00");     //Necessário Try/Catch
        System.out.println(num3.intValue() + " - Utilizanado '.parse()'");
    }
}
