import java.util.Scanner;

public class ContaNumPositivoENegativo {
    int numeroPositivo = 0;
    int numeroNegativo = 0;
    String input = "null";
    int inputInt;

    Scanner scanner = new Scanner(System.in);

    public void contadorNumPositivoENegativo() {
        do {
            System.out.println("Digite um número (ou fim para encerrar):");

            //primeiro verifica se o próximo input é Integer se for vai comparar se é positivo ou negativo
            //se não for Integer vai ser interpretado como string como o único uso da string é para encerrar
            //o loop qualquer valor diferente dos verificados serão apenas ignorados
            if (scanner.hasNextInt()) {
                this.inputInt = scanner.nextInt();

                if (this.inputInt > 0) {
                    numeroPositivo++;
                } else if (this.inputInt < 0) {
                    numeroNegativo++;
                } else {
                    System.out.println("0 não é considerado nem positivo nem negativo!");
                }
            } else {
                this.input = scanner.nextLine();
            }

        } while (!this.input.equalsIgnoreCase("fim"));

        System.out.println("Números positivos: " + numeroPositivo + "\nNúmeros negativos: " + numeroNegativo);
        scanner.close();
    }
}
