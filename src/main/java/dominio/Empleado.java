package dominio;

public class Empleado extends Persona{
    private String departamento;
    private double salario;

    public Empleado() {
    }

    public Empleado(String departamento, double salario) {
        this.departamento = departamento;
        this.salario = salario;
    }

    public Empleado(String nombre, String apellido, int edad, String departamento, double salario) {
        super(nombre, apellido, edad);
        this.departamento = departamento;
        this.salario = salario;
    }

    public String departamento() {
        return departamento;
    }

    public Empleado setDepartamento(String departamento) {
        this.departamento = departamento;
        return this;
    }

    public double salario() {
        return salario;
    }

    public Empleado setSalario(double salario) {
        this.salario = salario;
        return this;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "departamento:'" + departamento + '\'' +
                ", salario: " + salario +
                '}';
    }
}
