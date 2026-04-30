import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Scanner scanner = new Scanner(System.in);
        SomaArray contador = new SomaArray();
        int[] valores = {10, 20, 30, 40, 50};

        System.out.println("Digite a quantidade de degraus:");
        //int degraus = scanner.nextInt();

        contador.somar(valores);
        //scanner.close();
        }
    }