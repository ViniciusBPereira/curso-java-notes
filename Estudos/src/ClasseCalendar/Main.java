package ClasseCalendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        Calendar hoje = Calendar.getInstance(); //singleton

        int ano = hoje.get(Calendar.YEAR);
        int mes = hoje.get(Calendar.MONTH);
        int dia = hoje.get(Calendar.DAY_OF_MONTH);
        int hora = hoje.get(Calendar.HOUR_OF_DAY);
        int minutos = hoje.get(Calendar.MINUTE);
        int segundos = hoje.get(Calendar.SECOND);

        System.out.printf("Data - %d/0%d/%d\n", dia, mes, ano);
        System.out.printf("Hora - %d:%d:%d", hora, minutos, segundos);
        System.out.println();

        //-----------------------------------------------------------------------//
        // GregorianCalendar é uma extensão da classe Calendar
        // A sua única diferença é que possui o comando para verificar se um ano é bissexto ou não
        // Comando diferente: 'nome_da_instância.isLeapYear(ano)'
        // E ela possui um construtor

        GregorianCalendar hoje_2 = new GregorianCalendar();
        System.out.printf("O ano %d é bissexto? %b", ano, hoje_2.isLeapYear(ano));


    }
}
