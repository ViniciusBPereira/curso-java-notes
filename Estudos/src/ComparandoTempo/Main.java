package ComparandoTempo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        try {
            diferencaDataAteJava7();        //Mais Antiga
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println("------------------------------------------------------------------------");

        diferencaDataJava8();               //Mais Atual

        System.out.println("------------------------------------------------------------------------");

        diferencaDataJava8ComTempo();

        System.out.println("------------------------------------------------------------------------");

        diferencaDataJava8ComChronoUnit();
    }

    public static void diferencaDataAteJava7() throws ParseException {

        SimpleDateFormat SDF = new SimpleDateFormat("dd/MM/yyyy");
        Date primeiraDT = SDF.parse("01/01/2019");
        Date segundaDT = SDF.parse("01/02/2019");

        long diffMil = Math.abs(segundaDT.getTime() - primeiraDT.getTime());

        long diff = TimeUnit.DAYS.convert(diffMil, TimeUnit.MILLISECONDS); //Convertendo Milissegundos para Dias
        //TimeUnit.DAYS/MINUTES/HOURS/MILLISECONDS.convert(variável_quantidade, indicando_que_é_milissegundos);
        //Classe           UnidadeFinal            Método       Quantidade           UnidadeInicial

        System.out.println(diff + " dias - Transformando Milissegundos em Dias");

        //------------------------------------------------------------------------------------------//

        long Dias = (diffMil / (1000 * 60 * 60 * 24));
        //                      Mili  Min  Hora  Dia
        //Fazendo a conta manualmente

        System.out.println(Dias + " dias - Transformando Milissegundos em Dias MANUALMENTE");
    }

    public static void diferencaDataJava8(){

        LocalDate data1 = LocalDate.of(2019, 01, 01);
        LocalDate data2 = LocalDate.of(2021, 02, 10);

        Period diferenca = Period.between(data1, data2);

        int Dias = diferenca.getDays();
        int Mes = diferenca.getMonths();
        int Ano = diferenca.getYears();

        System.out.printf("%d Anos %d Meses %d Dias - Comparando com 'Period' \n", Ano, Mes, Dias);
    }

    public static void diferencaDataJava8ComTempo(){
        LocalDateTime data1 = LocalDateTime.of(2019, 1, 1, 6, 30);
        LocalDateTime data2 = LocalDateTime.of(2019, 1, 1, 8, 30);

        Duration duracao = Duration.between(data1, data2);

        long Horario = duracao.toHours();
        long Minutos = duracao.toMinutes();

        System.out.println(Horario + " Horas - Comparando Com 'Duration'");
        System.out.println("   ou                                         ");
        System.out.println(Minutos + " Minutos - Comparando Com 'Duration'");
    }

    public static void diferencaDataJava8ComChronoUnit(){
        LocalDateTime data1 = LocalDateTime.of(2019, 1, 1, 6, 30);
        LocalDateTime data2 = LocalDateTime.of(2019, 1, 1, 8, 30);

        long diff = ChronoUnit.HOURS.between(data1, data2);
        long diff_2 = ChronoUnit.MINUTES.between(data1, data2);

        System.out.println(diff + " Horas - Comparando Com 'ChronoUnit' ");
        System.out.println("   ou                                         ");
        System.out.println(diff_2 + " Minutos - Comparando Com 'ChronoUnit' ");

    }

}
