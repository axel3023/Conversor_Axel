import java.util.Scanner;

public class Conversiones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seleccion = 0;
        double num = 0;
        double total = 0;
        System.out.println("Bienvenido al conversor de unidades");
        System.out.println("Seleccione que quiere hacer:");
        System.out.println("1.- Kilometros a Millas");
        System.out.println("2. Litros a Galones");
        System.out.println("3. Gramos a onzas");
        System.out.println("4. Centimetros a Pulgadas");
        System.out.println("5. Salir");
        seleccion = Integer.parseInt(scanner.nextLine());
        if (seleccion == 1) {
            System.out.println("Ingrese la cantidad de kilometros:");
            num = Double.parseDouble(scanner.nextLine());
            total = num * 0.621371;
            System.out.println(num + " kilometros son " + total + " millas.");
        } else if (seleccion == 2) {
            System.out.println("Ingrese la cantidad de litros:");
            num = Double.parseDouble(scanner.nextLine());
            total = num * 0.264172;
            System.out.println(num + " litros son " + total + " galones.");
        } else if (seleccion == 3) {
            System.out.println("Ingrese la cantidad de gramos:");
            num = Double.parseDouble(scanner.nextLine());
            total = num * 0.035274;
            System.out.println(num + " gramos son " + total + " onzas.");
        } else if (seleccion == 4) {
            System.out.println("Ingrese la cantidad de centimetros:");
            num = Double.parseDouble(scanner.nextLine());
            total = num * 0.393701;
            System.out.println(num + " centimetros son " + total + " pulgadas.");
        } else if (seleccion == 5) {
            System.out.println("Saliendo del programa...");
        } else {
            System.out.println("Opción no válida, por favor intente de nuevo.");
        }
        scanner.close();
    }
}