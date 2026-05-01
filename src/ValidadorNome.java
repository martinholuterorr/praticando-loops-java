import java.util.Scanner;

public class ValidadorNome {
    private String nome = "A";
    private String nomeDigitado = "A";
    Scanner scanner = new Scanner(System.in);

    public void digitarNome() {
        while (nomeDigitado.length() < 3) {
            System.out.println("Digite seu nome:");
            this.nomeDigitado = scanner.nextLine();

            if (this.nomeDigitado.length() >= 3) {
                this.nome = this.nomeDigitado;
                System.out.println("Nome " + this.nome + " cadastrado com sucesso!");
                scanner.close();
                break;
            } else {
                System.out.println("Nome inválido! Digite novamente.");
            }
        }
    }
}
