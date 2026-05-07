import java.util.ArrayList;
import java.util.Scanner;

public class ListaConvidados {
    private ArrayList<String> convidados = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    private String input;

    private void exibirLista() {
        if (this.convidados.isEmpty()) {
            System.out.println("A lista está vazia");
            return;
        }

        System.out.print("Lista atualizada de convidados: [");
        for (int i = 0; i < this.convidados.size(); i++) {
            if (i == this.convidados.size() - 1) {
                System.out.print(this.convidados.get(i) + "]\n");
            } else {
                System.out.print(this.convidados.get(i) + ", ");
            }
        }

    }

    public void adicionarConvidado(String nome) {
        //esse primeiro if foi posto para não cair no método compararNomes se a lista estiver vazia
        if (this.convidados.isEmpty()) {
            this.convidados.add(nome);
            System.out.println(nome + " foi adicionado à lista de convidados.");
        } else if (this.compararNomes(nome)) {
            System.out.println("O nome " + nome + " já está na lista de convidados.");
        } else {
            this.convidados.add(nome);
            System.out.println(nome + " foi adicionado à lista de convidados.");
        }
    }

    private boolean compararNomes(String nome) {
        //criar esse metodo pode ser menos eficiente do que usar contains mas optei dessa forma porque contains
        //é case sensitive, exemplo usando contains Ana e ana são diferentes, logo adicionaria as duas strings
        //na lista, desse jeito Ana e ana são iguais e somente o primeiro input será adicionado na lista
        for (int i = 0; i < this.convidados.size(); i++) {
            if (nome.equalsIgnoreCase(this.convidados.get(i))) {
                return true;
            }
        }

        return false;
    }

    public void iniciar() {
        do {
            System.out.println("Digite o nome do convidado (ou 'ver' para visualizar a lista, 'sair' para terminar):");
            this.input = this.scanner.nextLine();

            if (this.input.equalsIgnoreCase("ver")) {
                this.exibirLista();
            } else if (this.input.equalsIgnoreCase("sair")) {
                break;
            } else {
                this.adicionarConvidado(this.input);
            }
        } while (!this.input.equalsIgnoreCase("sair"));

        this.scanner.close();
    }
}
