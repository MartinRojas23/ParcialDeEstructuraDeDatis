import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Calculadora De Propinas");
        System.out.println("Ingresar La Cantidad a Pagar");
        double cantidad = Entrada.nextDouble();
        System.out.println("Ingresar el % de propina");
        int porcentaje = Entrada.nextInt();
       /* if (porcentaje < 15) {
            System.out.println("El servicio no fue bueno ");
        } else {
            System.out.println("El servicio fue bueno");
        }
        */
        if (porcentaje < 15) {
            System.out.println("El servicio no fue bueno ");
        } else if (15 <= porcentaje && porcentaje <30)       {
            System.out.println("El servicio fue bueno");
        } else {
            System.out.println("El servicio fue excelente");
        }

        double total = (cantidad * porcentaje / 100);
        System.out.printf("El total es: %.1f", total);
    }

}
