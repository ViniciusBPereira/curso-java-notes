package TimeZone;

import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;

public class Main {
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();
        TimeZone TZ = calendario.getTimeZone();

        System.out.println(TZ);

        /*
        String[] fusos = TimeZone.getAvailableIDs();
        for(int i = 0; i < fusos.length; i++){
            System.out.println(fusos[i]);
        }
        */

        TimeZone tzSP = TimeZone.getTimeZone("America/Sao_Paulo");
        System.out.println(tzSP.getDisplayName());
        System.out.println(tzSP.getID());
    }
}
