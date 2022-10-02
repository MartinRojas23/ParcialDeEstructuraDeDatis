import java.util.Scanner;

public class Ciclos {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        System.out.println("¿Cuantos Numeros queres procesar?");
        int cantidad = Entrada.nextInt();

       System.out.printf("Ingresar %d datos", cantidad);
        // Ciclo for
              /* for (int i = 1; i <= cantidad; i++ ) {
         System.out.printf("Dato %d: ", i);
          int num = Entrada.nextInt();
          int resultado = num * 2;
         System.out.printf("Dato %d procesado: %d\n ",i, resultado);
        }*/
        int c = 1;
        while(c <= cantidad) {
            System.out.printf("Dato %d: ",c );
            int num = Entrada.nextInt();
            int resultado = num * 2;
            System.out.printf("Dato %d procesado: %d\n ",c,resultado);
            c++;
    }

    }
}
