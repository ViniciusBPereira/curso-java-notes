package LocalDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //data yyyy-MM-dd
        LocalDate agora = LocalDate.now();
        System.out.println(agora + " - Hoje"); //Pegando a data de hoje

        //-------------------------------------------------------//

        System.out.println(agora.plusDays(30) + " - Daqui 30 dias"); //Adicionando 30 dias
        System.out.println(agora.minusDays(30) + " - Diminuindo 30 dias"); //Diminuindo 30 dias

        //-------------------------------------------------------//

        System.out.println(LocalDate.of(2019, 2, 1) + " - Definido"); //Definindo qualquer data

        //-------------------------------------------------------//

        String Data = "2020-11-20";
        System.out.println(LocalDate.parse(Data) + " - String"); //String pra LocalDate

        //-------------------------------------------------------//

        System.out.println(agora.getDayOfWeek()); //Dia da Semana
        System.out.println(agora.getDayOfMonth()); //Dia do Mês
        System.out.println(agora.getDayOfYear()); //Dia do ano (1 ano = 365 dias)

        //-------------------------------------------------------//

        System.out.println(agora.isLeapYear()); //É um ano bissexto?

        //-------------------------------------------------------//

        LocalTime horario = LocalTime.now();
        System.out.println(horario + " - Horario de agora"); //Hora

        //-------------------------------------------------------//

        System.out.println(LocalTime.of(20, 18) + " - Horario Definido"); //.of() possibilita-lhe definir um horario específico

        //-------------------------------------------------------//

        System.out.println(agora.plusDays(30) + " - Adiciona"); //Adicionar dia igual a classe Date
        System.out.println(agora.minusDays(30) + " - Remove"); //Remove dia igual a classe Date

        //-------------------------------------------------------//

        LocalDateTime AgoraCompleto = LocalDateTime.now();
        System.out.println(AgoraCompleto);

        //-------------------------------------------------------//

        ZoneId fuso = ZoneId.systemDefault();
        System.out.println(fuso);

        //-------------------------------------------------------//

        Date data = new Date();
        Calendar c = Calendar.getInstance();

        LocalDateTime ldtDate = LocalDateTime.ofInstant(data.toInstant(), fuso); //Transformando Date
        LocalDateTime ldtDate_2 = LocalDateTime.ofInstant(c.toInstant(), fuso);  //Transformando Calender

        System.out.println(ldtDate + " - Transformando Date em LocalDateTime");
        System.out.println(ldtDate_2 + " - Transformando Calendar em LocalDateTime");
    }
}
