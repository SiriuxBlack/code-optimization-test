//importamos Scanner
import java.util.Scanner;
public class AgeValidation {
    public static void main(String[] args) {
        //definimos scanner
        Scanner scanner = new Scanner(System.in);
        //definimos la constante AGE_LIMIT
        final int AGE_LIMIT = 18;
        //pedimos por teclado la edad, esto lo hacemos con un scanner
        System.out.println("Ingrese su edad: ");
        int age = scanner.nextInt();
        //usamos un if-else para delimitar si se le da acceso o no 

        if (age >= AGE_LIMIT) {
            System.out.println("Access granted");
        }else{ 
            System.out.println("Access denied");
        }
    }
}