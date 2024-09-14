import java.util.Scanner;
public class AgeValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int AGE_LIMIT = 18;
        System.out.println("Ingrese su edad: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("Access granted");
        }else{ 
            System.out.println("Access denied");
        }
    }
}
