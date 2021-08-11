package Extend;

public class Gato extends Animal{

    String especie = "Gato";
    Double peso = 8.5;

    public void Info(){
        System.out.println("Especie: " + especie);
        System.out.println("Peso: " + peso);
        Information();
    }
}
