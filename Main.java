import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hola bienvenido ingresa los grados!");
        float grados = scanner.nextFloat();
        int fahrenheit = (int) ((grados*1.8)+32);
        System.out.println("La temperatura en Fahrenheit es:"+fahrenheit);
    }
}