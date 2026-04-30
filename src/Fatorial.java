public class Fatorial {
    public void calcular(int fatorial) {
        //tem que inicializar a variável produto em 1 em vez de 0 se não o resultado sempre será 0
        //pois qualquer número multiplicado por 0 sempre será 0
        int produto = 1;

        for (int i = fatorial; i>= 1; i--) {
            produto *= i;
        }

        System.out.println("O fatorial de " + fatorial + " é: " + produto);
    }
}
