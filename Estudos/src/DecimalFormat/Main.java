package DecimalFormat;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        //A DecimalFormat é uma classe que extend da classe NumberFormat
        String padrao = "###,###.##";
        DecimalFormat df = new DecimalFormat(padrao);                       //Forma 1
        //df.applyPattern(padrao);                                            Forma 2

        System.out.println(df.format(444444.44));
        System.out.println(df.format(2500.50));
        System.out.println(df.format(1000));
        System.out.println(df.format(0.1000));

        //-------------------------------------------------------------------------------
        //MONETARIO

        System.out.println("--------------------------------------------------------------------");

        padrao = "\u00A4 ###,###.##";
        DecimalFormat df_monetario = new DecimalFormat(padrao);

        System.out.println(df_monetario.format(444444.44));
        System.out.println(df_monetario.format(2500.50));
        System.out.println(df_monetario.format(1000));
        System.out.println(df_monetario.format(0.1000));

        //-------------------------------------------------------------------------------
        //NEGATIVO

        System.out.println("--------------------------------------------------------------------");

        padrao = "-###,###.##";
        DecimalFormat df_negativo = new DecimalFormat(padrao);

        System.out.println(df_negativo.format(444444.44));
        System.out.println(df_negativo.format(2500.50));
        System.out.println(df_negativo.format(1000));
        System.out.println(df_negativo.format(0.1000));
    }
}
