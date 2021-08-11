package Wrapper;

public class TesteWrapper {

    public static void main(String[] args) {

        //-----------------------------------------------------------------------------------------------//
        //                                           PRIMITIVOS                                          //
        //-----------------------------------------------------------------------------------------------//

        short num1 = 1;
        byte num2 = 10;
        int num3 = 100;
        long num4 = 1000L;
        float num5 = 3.5f;
        double num6 = 3.555555;
        boolean flag = true;
        char a = 'a';

        //-----------------------------------------------------------------------------------------------//
        //                                 OBJETOS INSTÂNCIAS / CAST                                     //
        //-----------------------------------------------------------------------------------------------//
        //Lembrando que os objetos são classes também

        Short num7 = new Short((short) 1);
        Byte num8 = new Byte((byte) 10);
        Integer num9 = new Integer((int)100);
        Long num10 = new Long((long) 1000);
        Float num11 = new Float((float) 3.5);
        Double num12 = new Double((Double) 3.5);
        Boolean flag2 = new Boolean((boolean) true);
        Character b = new Character((char) 'b');

        //-----------------------------------------------------------------------------------------------//
        //                    TRANSFORMANDO VALORES ATRAVÉS DO MÉTODO '...Value()'                      //
        //-----------------------------------------------------------------------------------------------//
        //Objeto.''Value("numero");
        //No lugar do '' é colocado o tipo que deseja

        Integer num13 = new Integer("1000");
        Double num14 = new Double("3.5");
        System.out.println(num13.floatValue());
        System.out.println(num14.longValue());

        //-----------------------------------------------------------------------------------------------//
        //                    TRANSFORMANDO VALORES ATRAVÉS DO MÉTODO 'parse...()'                      //
        //-----------------------------------------------------------------------------------------------//
        //Objeto.parse''("numero");
        //No lugar do '' é colocado o tipo que deseja

        Short num15 = Short.parseShort("1");
        Byte num16 = Byte.parseByte("10");
        Integer num17 = Integer.parseInt("100");
        Long num18 = Long.parseLong("1000");
        Double num19 = Double.parseDouble("3.5");

        //-----------------------------------------------------------------------------------------------//
        //                    TRANSFORMANDO VALORES ATRAVÉS DE MÉTODO '.valueOf()'                      //
        //-----------------------------------------------------------------------------------------------//
        //Objeto.valueOf("numero");

        Short num20 = Short.valueOf("1");
        Byte num21 = Byte.valueOf("10");
        Integer num22 = Integer.valueOf("100");
        Double num23 = Double.valueOf("1000");
    }
}
