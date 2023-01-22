import dominio.Empleado;
import dominio.Persona;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Persona persona = new Persona();
        Persona empleado = new Empleado();
        Scanner entrada = new Scanner(System.in);
        int menu;
        System.out.println("ssssssssssSeleccione una de las siguientes opciones: \n"+
                "1. digitar informacion completa. \n" +
                "2. Digitar solo nombre, apellido y edad. \n" +
                "3. Digitar solo la informacion laboral. \n"+
                "0. salir. ");

        menu = Integer.parseInt(entrada.nextLine());

        switch (menu){
            case 1:
                System.out.println("Digite su nombre");
                var nombre = entrada.nextLine();
                System.out.println("Digite apellido");
                var apellido = entrada.next();

                System.out.println("Digite area de trabajo");
                var departamento = entrada.next();
                Persona empleado1 = new Empleado(nombre,apellido,departamento);
                System.out.println(empleado1.toString());
        }

    }
}
