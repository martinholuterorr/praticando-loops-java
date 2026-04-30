import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Fatorial contador = new Fatorial();

        System.out.println("Digite um número para calcular o fatorial:");
        int numero = scanner.nextInt();

        contador.calcular(numero);
        scanner.close();
        }
    }