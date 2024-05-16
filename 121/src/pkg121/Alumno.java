
package pkg121;

public class Alumno {
    int dato;   
    String nombre;
    String apellido;
    public Alumno() {
    }
    public Alumno(int dato, String nombre, String apellido) {
        this.dato = dato;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    

    
      public void mostrarNombre()
    {
    System.out.println("hola soy el alumno y se decir mi nombre ");
    }
}

