import java.util.Scanner;

public class ValidadorNome {
    private String nome = "A";
    Scanner scanner = new Scanner(System.in);

    public void digitarNome() {
        while (nome.length() < 3) {
            System.out.println("Digite seu nome:");
            this.nome = scanner.nextLine();

            if (this.nome.length() >= 3) {
                System.out.println("Nome " + this.nome + " cadastrado com sucesso!");
                scanner.close();
                break;
            } else {
                System.out.println("Nome inválido! Digite novamente.");
            }
        }
    }
}
