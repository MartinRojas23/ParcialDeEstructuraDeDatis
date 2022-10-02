public class ConceptosBasicos {
    public static void main(String[] args) {
        int Personas = 3;
        int Pizza = 6;
        int PizzaPorPersona =   Pizza / Personas;
        System.out.printf("Si hay %d pizza y %d personas, a cada una le tocan %d pizzas\n", Pizza, Personas, PizzaPorPersona );

        String auto = "Ferrari";
        double velocidad = 90.3;
        System.out.printf("El auto %s se desplaza a %f km/h\n",auto,velocidad);

        int PrecioLeche = 14;
        double PrecioJamon = 35.6;
        int PrecioHuevo = 23;
        double PrecioTotal = PrecioHuevo+PrecioJamon+PrecioLeche;

        System.out.printf("El precio total es: %f\n", PrecioTotal);

    }
}
