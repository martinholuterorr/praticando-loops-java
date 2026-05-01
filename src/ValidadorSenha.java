import java.util.Scanner;

public class ValidadorSenha {
    private int senha = 1234;
    private int senhaDigitada = 0000;
    private int tentativas = 2;
    Scanner scanner = new Scanner(System.in);

    public void login() {
        while (tentativas >= 0) {
            System.out.println("Digite sua senha: ");
            this.senhaDigitada = scanner.nextInt();

            if (senha == senhaDigitada) {
                System.out.println("Senha correta!\nAcesso concedido!");
                scanner.close();
                break;
            } else if (tentativas < 2) {
                System.out.println("Senha incorreta!\nVocê tem " + tentativas + " tentativa restante!");
            } else {
                System.out.println("Senha incorreta!\nVocê tem " + tentativas + " tentativas restantes!");
            }

            this.tentativas--;
        }

        System.out.println("Conta bloqueada temporariamente!");
        scanner.close();
    }
}
