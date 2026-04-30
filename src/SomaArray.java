public class SomaArray {
    public void somar(int[] arrayNumeros) {
        int soma = 0;

        for (int i = 0; i < arrayNumeros.length; i++) {
            soma += arrayNumeros[i];
        }

        System.out.println("A soma total das receitas é: " + soma);
    }
}