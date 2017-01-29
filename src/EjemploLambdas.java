import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjemploLambdas {

    public static void main(String[] args) {

        ITallaString talla = (ola) -> {
            return ola.substring(0, 3);
        };
        System.out.println(talla.tallaString("salchicha"));

        IsumaNumero numeros = (numero1, numero2) -> {
            return numero1 + numero2;
        };
        System.out.println(numeros.sumaNumbers(1, 2));

        IreadNumero numero = () -> {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int nume = 0;
            boolean error;
            do {
                try {
                    System.out.println("Introduce numero:");
                    nume = Integer.parseInt(br.readLine());
                    error = false;
                } catch (IOException ex) {
                    System.out.println("Error de entrada y salida");
                    error = true;
                } catch (NumberFormatException ex) {
                    System.out.println("No has introducido un nº entero.");
                    error = true;
                }
            } while (error);
            return nume;
        };
        System.out.println(numero.readNumber());
    }
}