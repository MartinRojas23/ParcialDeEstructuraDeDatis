import java.util.Scanner;

public class AdivinaElNumero {
    private Scanner entrada = new Scanner(System.in);
    private boolean JuegoActivo = true;
    public void jugar () {
        System.out.println("Hola,¿cual es tu nombre?");
        String nombreJugador = entrada.nextLine();
        System.out.printf("Bienvenido %s, vamos a comenzar\n", nombreJugador);


        while (JuegoActivo) {
            int intentos = 0;
            int min = 0;
            int max = 100;
            int numeroJuego = (int) (Math.random() * ((max - min) + 1));
            System.out.printf("%s, he escogido uno entre %d y %d, intenta adivinarlo \n ", nombreJugador, min, max);
            int numjugador;

            do {
                System.out.println("escoge un numero");
                numjugador = entrada.nextInt();
                if (numeroJuego < numjugador) {
                    System.out.println("Muy alto");
                } else if (numeroJuego > numjugador) {
                    System.out.println("Muy bajo, intenta otra vez");
                }
                intentos++;
            } while (numeroJuego != numjugador);
            System.out.printf("Has ganado,cantidad de intentos= %d", intentos);
            JuegoActivo = false;

        }


        }

    }

