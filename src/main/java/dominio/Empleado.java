package dominio;

public class Empleado extends Persona{
    private String departamento;


    public Empleado() {
    }

    public Empleado(String departamento) {
        this.departamento = departamento;

    }

    public String departamento() {
        return departamento;
    }

    public Empleado setDepartamento(String departamento) {
        this.departamento = departamento;
        return this;
    }

    public Empleado(String nombre, String apellido, String departamento) {
        super(nombre, apellido);
        this.departamento = departamento;




    }

    @Override
    public String toString() {
        return  super.toString() +
                "departamento:'" + departamento + '\'' +
                ", salario: " +
                '}';
    }
}
