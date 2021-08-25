package DateFormat;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        Date hoje = new Date();
        System.out.println(hoje);

        //---------------------------------------------------------------------------//

        Locale.setDefault(new Locale("pt", "BR"));
        System.out.println(Locale.getDefault());

        //---------------------------------------------------------------------------//

        String hoje_formatado = DateFormat.getInstance().format(hoje);
        System.out.println(hoje_formatado);

        hoje_formatado = DateFormat.getTimeInstance().format(hoje);
        System.out.println(hoje_formatado);

        //---------------------------------------------------------------------------//

        System.out.println(" ------------------------------------ ");

        hoje_formatado = DateFormat.getTimeInstance(DateFormat.SHORT).format(hoje);
        System.out.println(hoje_formatado + " - Curto");

        hoje_formatado = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(hoje);
        System.out.println(hoje_formatado + " - Medio");

        hoje_formatado = DateFormat.getTimeInstance(DateFormat.LONG).format(hoje);
        System.out.println(hoje_formatado + " - Longo");
    }
}
