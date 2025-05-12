//Inicializa la clase Welcome
//Crea el método main
import java.util.Scanner;

public class Welcome {

    public static void main(String[] args) {
        greeting();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Escribe tu nombre: ");
        String userName = scanner.nextLine();

        greetingCoder(userName);

        scanner.close();
    }
//Tarea 1
//Define el método greeting que imprima en terminal ¡Hola FemCoder!
//Ejecuta el método greeting 
public static void greeting() {
    System.out.println("¡Hola FemCoder!");
}
//Tarea 2
//Define el método greetingCoder que reciba un nombre y que imprima en terminal ¡Hola <name>!
//Ejecuta el método greetingCoder 
public static void greetingCoder(String name) {
    System.out.println("¡Hola " + name + "!");
}

}

//¿Sabes donde definir el método y en dónde lo has de ejecutar? Si no lo sabes vuelve al archivo de Resources.md
