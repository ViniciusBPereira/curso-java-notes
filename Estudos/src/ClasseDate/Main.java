package ClasseDate;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date hoje = new Date();
        System.out.println(hoje);
        System.out.println("Milissegundos desde 1 Jan 1970: " + hoje.getTime());

        System.out.println(hoje.getDate());
    }
}
