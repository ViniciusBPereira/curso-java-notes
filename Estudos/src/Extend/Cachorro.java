package Extend;

public class Cachorro extends Animal{

    Double peso = 10.5;
    String especie = "Cachorro";

    public void Info(){
        System.out.println("Especie: " + especie);
        System.out.println("Peso: " + peso);
        Information();
    }
}
