// Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1,
// o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.

// Entrada
// O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores, respectivamente dois inteiros e um valor com 2 casas decimais.

// Saída
// A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo,
// lembrando de deixar um espaço após os dois pontos e um espaço após o "R$". O valor deverá ser apresentado com 2 casas após o ponto.

import java.io.IOException;
import java.util.Scanner;

public class m004 {
    public static class Peca {
        public int cod;
        public int qt;
        public float preco;

        public Peca(int cod, int qt, float preco) {
            this.cod = cod;
            this.qt = qt;
            this.preco = preco;
        }

        public double calcularValorTotal() {
            return qt * preco;
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);

        int cod1 = ler.nextInt();
        int qt1 = ler.nextInt();
        float preco1 = ler.nextFloat();

        int cod2 = ler.nextInt();
        int qt2 = ler.nextInt();
        float preco2 = ler.nextFloat();

        Peca peca1 = new Peca(cod1, qt1, preco1);
        Peca peca2 = new Peca(cod2, qt2, preco2);

        double valor_total = peca1.calcularValorTotal() + peca2.calcularValorTotal();
        String valor_total_Formatado = String.format("%.2f", valor_total);

        System.out.println("VALOR A PAGAR: R$ " + valor_total_Formatado);

    }

}