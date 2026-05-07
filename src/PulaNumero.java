public class PulaNumero {
    public void imprimirNumeros(int inputUsuario) {
        for (int i = 1; i <= inputUsuario; i++) {

            if (i % 10 == 5) {
                continue;
            }

            System.out.print( i + " ");
        }
    }
}
