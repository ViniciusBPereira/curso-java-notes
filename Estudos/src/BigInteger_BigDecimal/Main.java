package BigInteger_BigDecimal;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {

        double a = 0.03;
        double b = 0.04;
        double c = b - a;
        System.out.println(c);

        // --------------------------------------------------------------------------------------------- //
        //BIG DECIMAL

        System.out.println("--------------------------------------------------------------------");

        BigDecimal a2 = new BigDecimal("0.03");
        BigDecimal b2 = new BigDecimal("0.04");
        BigDecimal c2 = b2.subtract(a2);
        System.out.println(c2);

        BigDecimal bd1 = new BigDecimal("1234567890.0987654321");
        BigDecimal bd2 = new BigDecimal("987654321.9876543210");
        System.out.println(bd1.add(bd2));
        System.out.println(bd1.multiply(bd2));
        System.out.println(bd1.divide(new BigDecimal(2)));

        // --------------------------------------------------------------------------------------------- //
        //BIG INTEGER

        System.out.println("--------------------------------------------------------------------");

        BigInteger bi1 = new BigInteger("1000000000000000000000");
        BigInteger bi2 = new BigInteger("2000000000000000000000");
        System.out.println(bi1.subtract(bi2));
        System.out.println(bi1.add(bi2));
        System.out.println(bi1.multiply(bi2));
        System.out.println(bi1.divide(new BigInteger("2")));

    }
}
