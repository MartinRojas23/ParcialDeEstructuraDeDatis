import java.util.Scanner;

public class Teclado {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        System.out.println("¿Cuál es tu nombre");
        String nombre = Entrada.nextLine();
        System.out.println("Tu nombre es:  " + nombre);
        System.out.println("¿Cual es tu edad?");
        int edad = Entrada.nextInt();
        System.out.println("Tu edad es: " + edad);
        System.out.println("¿Cual es tu número?");
        int Telefono = Entrada.nextInt();
        System.out.printf("Tu nombre %s\n, Tu edad %d\n Y tu numero es %d\n :", nombre+edad+Telefono );

    }
}
