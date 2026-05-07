import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");

        PulaNumero usuario = new PulaNumero();
        usuario.imprimirNumeros(scanner.nextInt());

        scanner.close();
        }
    }