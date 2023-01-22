package dominio;

public class Persona {
    private String nombre;
    private String apellido;
    //private double edad;

    public Persona() {
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;

    }
    public void Listar(){
        System.out.println("nombre = " + nombre);
        System.out.println("apellido = " + apellido);

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


    @Override
    public String toString() {
        return "Datos de Persona{" +
                "nombre: '" + nombre + '\'' +
                ", apellido: '" + apellido + '\'' +
                ", edad: " +
                '}';
    }
}
