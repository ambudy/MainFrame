package Sobrecargademetodos;

public class Main{
    public static void main(String [] args ) {
        Sobrecarga persona1 = new Sobrecarga("ambudy", 34);
        persona1.correr();

        Sobrecarga persona2 = new Sobrecarga("12345");
        persona2.correr(10, "samir", 10);
    }
}