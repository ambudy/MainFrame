//encapsular y metodos accesores (settters y getters)
package Encapsular;
public class Encapsular1{
    private int edad;
    private String nombre;
    //metodo setters establecemos la edad 
    public void SetEdad(int edad) {
        this.edad = edad;
    }
    //metodo getters  mostramos la edad
    public int GetEdad() {
        return edad;

    }

    public void SetNombre(String nombre){
        this.nombre = nombre;
    }

    public String GetNombre(){
        return nombre;
    }
}