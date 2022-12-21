package Encapsular;
public class Encapsular2{
    public static void main(String [] args){
        Encapsular1 obj1 = new Encapsular1();
        obj1.SetEdad(34);
        System.out.println("la edad es " + obj1.GetEdad());

        obj1.SetNombre("ambudy calvo");
        System.out.println("mi nombre es " +obj1.GetNombre());
    }
}
