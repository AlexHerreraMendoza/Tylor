package tylor;

public class TaylorSeriesSine {

    public static double sinTaylor(double x0, double x1) {
        // Calculamos h = x1 - x0
        double h = x1 - x0;

        // f(x0) = sin(x0)
        double f_x0 = Math.sin(x0);

        // f'(x0) = cos(x0)
        double f_prime_x0 = Math.cos(x0);

        // f''(x0) = -sin(x0)
        double f_double_prime_x0 = -Math.sin(x0);

        // f'''(x0) = -cos(x0)
        double f_triple_prime_x0 = -Math.cos(x0);

        // Serie de Taylor hasta el tercer término
        double f_x1_approx = f_x0 
                            + f_prime_x0 * h 
                            + (f_double_prime_x0 * Math.pow(h, 2)) / 2 
                            + (f_triple_prime_x0 * Math.pow(h, 3)) / 6;

        return f_x1_approx;
    }

    public static void main(String[] args) {
        // Punto x0
        double x0 = 0.2;
        // Punto x1 que queremos aproximar
        double x1 = 0.4;

        // Llamamos a la función
        double resultado = sinTaylor(x0, x1);

        // Mostramos el resultado
        System.out.println("La aproximación de sin(" + x1 + ") usando la serie de Taylor es: " + resultado);
    }
}



