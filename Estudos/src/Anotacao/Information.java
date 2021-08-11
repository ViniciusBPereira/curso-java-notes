package Anotacao;

public @interface Information {

    public String autor();

    public int numero();

    public String blog() default "http://teste.com";

    public String site() default "http://teste.com.br";


}
