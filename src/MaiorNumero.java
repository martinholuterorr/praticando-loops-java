public class MaiorNumero {
    int maior = Integer.MIN_VALUE;

    public void compararNumeros(String[] valoresDigitados) {
        for (int i = 0; i < valoresDigitados.length; i++){
            int num = Integer.parseInt(valoresDigitados[i]);

            if (num > this.maior)
                this.maior = num;
        }

        System.out.println("O maior número é: " + this.maior);
    }
}
