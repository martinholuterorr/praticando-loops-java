import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ContagemDegraus contador = new ContagemDegraus();

        System.out.println("Digite a quantidade de degraus:");
        int degraus = scanner.nextInt();

        contador.contarDegraus(degraus);
        scanner.close();
        }
    }