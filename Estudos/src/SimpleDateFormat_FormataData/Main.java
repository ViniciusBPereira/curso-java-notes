package SimpleDateFormat_FormataData;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat SDF = new SimpleDateFormat("dd/MMM/y hh:mm:ss a z");

        //Exemplo 1
        Calendar data = new GregorianCalendar(2010, 5, 20, 14, 32, 25);
        System.out.println(SDF.format(data.getTime()) + " - EXEMPLO 1");

        //Exemplo 2
        Date hoje = new Date();
        System.out.println(SDF.format(hoje) + " - EXEMPLO 2");

        //--------------------------------------------------------------------------------//
        //Transformando Date em String

        String d = SDF.format(hoje);
        System.out.println(d + " - STRING");

        //--------------------------------------------------------------------------------//
        //Transformando String em Date
        //O comando '.parse()' é utilizado para transformar String em Data precisa do 'try/catch'
        //Porque pode dar um Exception. O ParseException

        SimpleDateFormat SDF_2 = new SimpleDateFormat("dd/MM/yyyy");
        String MinhaData = "20/02/2000";
        Date TransformandoString = SDF_2.parse(MinhaData);
        System.out.println(SDF.format(TransformandoString) + " - DATE");

    }
}
