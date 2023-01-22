package dominio;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    public void Listar(){
        System.out.println("nombre = " + nombre);
        System.out.println("apellido = " + apellido);
        System.out.println("edad = " + edad);
    }

    public String nombre() {
        return nombre;
    }

    public Persona setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public String apellido() {
        return apellido;
    }

    public Persona setApellido(String apellido) {
        this.apellido = apellido;
        return this;
    }

    public int edad() {
        return edad;
    }

    public Persona setEdad(int edad) {
        this.edad = edad;
        return this;
    }

    @Override
    public String toString() {
        return "Datos de Persona{" +
                "nombre: '" + nombre + '\'' +
                ", apellido: '" + apellido + '\'' +
                ", edad: " + edad +
                '}';
    }
}
